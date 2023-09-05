package com.ccnu.service.impl;

import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.mapper.UserStatusMapper;
import com.ccnu.pojo.UserAccount;
import com.ccnu.pojo.UserAccountExample;
import com.ccnu.pojo.UserStatus;
import com.ccnu.pojo.UserStatusExample;
import com.ccnu.service.UserStatusService;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: ccnu-bd
 * @description: 用户状态业务实现类
 * @author: lsc
 * @create: 2021-10-28 10:55
 **/
@Service
public class UserStatusImpl implements UserStatusService {

    @Autowired
    private UserStatusMapper userStatusMapper;
    @Autowired
    private UserAccountMapper userAccountMapper;

    @Override
    public void updateUserWorkStatus(Integer userId) {
        UserStatusExample userStatusExample = new UserStatusExample();
        userStatusExample.createCriteria().andUserIdEqualTo(userId);
        List<UserStatus> userStatuses = userStatusMapper.selectByExample(userStatusExample);
        UserStatus userStatus;
        if (userStatuses == null || userStatuses.size() < 1) {
            //没有记录则初始化用户状态
            userStatus = new UserStatus();
            userStatus.setUnlockTime(null);
            userStatus.setNumOfException(0);
            userStatus.setAccountStatus("0");
            userStatus.setUserId(userId);
            userStatus.setLastTime(new Date());
            //设置为下岗
            userStatus.setWorkStatus("1");
            userStatusMapper.insert(userStatus);
        }else {
            userStatus = userStatuses.get(0);
            //设置为不在岗
            userStatus.setWorkStatus("1");
        }
        //更新用户状态表
        userStatusMapper.updateByPrimaryKey(userStatus);

        UserAccountExample userAccountExample = new UserAccountExample();
        userAccountExample.createCriteria().andIdEqualTo(userId);
        List<UserAccount> userAccounts = userAccountMapper.selectByExample(userAccountExample);
        if(userAccounts == null || userAccounts.size() < 1){
            throw new AppException(ErrorCode.ERR_BIZ);
        }
        String tutorIdentificationCode = userAccounts.get(0).getUsername();
        //更新其17张数据表的信息为已删除状态
        userStatusMapper.updateUserWorkStatus(tutorIdentificationCode);
    }

    @Override
    public void updateUserOnWorkStatus(Integer userId) {
        UserStatusExample userStatusExample = new UserStatusExample();
        userStatusExample.createCriteria().andUserIdEqualTo(userId);
        List<UserStatus> userStatuses = userStatusMapper.selectByExample(userStatusExample);
        UserStatus userStatus;
        if (userStatuses == null || userStatuses.size() < 1) {
            //没有记录则初始化用户状态
            userStatus = new UserStatus();
            userStatus.setUnlockTime(null);
            userStatus.setNumOfException(0);
            userStatus.setAccountStatus("0");
            userStatus.setUserId(userId);
            userStatus.setLastTime(new Date());
            //设置为在岗
            userStatus.setWorkStatus("0");
            userStatusMapper.insert(userStatus);
        }else {
            userStatus = userStatuses.get(0);
            //设置为在岗
            userStatus.setWorkStatus("0");
        }
        //更新用户状态表
        userStatusMapper.updateByPrimaryKey(userStatus);

        UserAccountExample userAccountExample = new UserAccountExample();
        userAccountExample.createCriteria().andIdEqualTo(userId);
        List<UserAccount> userAccounts = userAccountMapper.selectByExample(userAccountExample);
        if(userAccounts == null || userAccounts.size() < 1){
            throw new AppException(ErrorCode.ERR_BIZ);
        }
        String tutorIdentificationCode = userAccounts.get(0).getUsername();
        //更新其17张数据表的信息为未删除状态
        userStatusMapper.updateUserOnWorkStatus(tutorIdentificationCode);
    }
}
