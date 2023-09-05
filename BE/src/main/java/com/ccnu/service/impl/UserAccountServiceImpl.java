package com.ccnu.service.impl;

import com.ccnu.mapper.ConfirmInformationMapper;
import com.ccnu.mapper.DoctorTutorInformation111Mapper;
import com.ccnu.mapper.DoctorTutorInformation111Xu1Mapper;
import com.ccnu.mapper.DoctorTutorInformation111Xu2Mapper;
import com.ccnu.mapper.UserAccountMapper;
import com.ccnu.mapper.UserStatusMapper;
import com.ccnu.pojo.ConfirmInformation;
import com.ccnu.pojo.DoctorTutorInformation111;
import com.ccnu.pojo.DoctorTutorInformation111Example;
import com.ccnu.pojo.DoctorTutorInformation111Xu1;
import com.ccnu.pojo.DoctorTutorInformation111Xu2;
import com.ccnu.pojo.LogTracker;
import com.ccnu.pojo.UserAccount;
import com.ccnu.pojo.UserAccountExample;
import com.ccnu.pojo.UserStatus;
import com.ccnu.pojo.UserStatusExample;
import com.ccnu.pojo.dto.UserInfosDto;
import com.ccnu.pojo.dto.UserTypeDto;
import com.ccnu.pojo.vo.UserAccountVo;
import com.ccnu.service.LogTrackerService;
import com.ccnu.service.UserAccountService;
import com.ccnu.utils.ActionEnum;
import com.ccnu.utils.ActionStatusEnum;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import com.ccnu.utils.JWTUtils;
import com.ccnu.utils.Md5passWd;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/22 22:31
 */
@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private UserAccountMapper userAccountMapper;
    @Autowired
    private DoctorTutorInformation111Mapper doctorTutorInformation111Mapper;
    @Autowired
    private DoctorTutorInformation111Xu1Mapper doctorTutorInformation111Xu1Mapper;
    @Autowired
    private DoctorTutorInformation111Xu2Mapper doctorTutorInformation111Xu2Mapper;
    @Autowired
    private ConfirmInformationMapper confirmInformationMapper;
    @Autowired
    private LogTrackerService logTrackerService;
    @Autowired
    private UserStatusMapper userStatusMapper;


    @Override
    public UserAccount getUserAccount(UserInfosDto userInfosDto) {
        UserAccountExample example = new UserAccountExample();
        UserAccountExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(userInfosDto.getUsername())) {
            criteria.andUsernameEqualTo(userInfosDto.getUsername());
        }
        List<UserAccount> userAccounts = userAccountMapper.selectByExample(example);
        if(userAccounts == null || userAccounts.size() < 1){
            return null;
        }
        return userAccounts.get(0);
    }

    /**
     * 删除用户
     * @param tutorIdentificationCode
     */
    public void deleteUser(String tutorIdentificationCode){
        //删除user_account、表1-1-1、xu1、xu2、confirm表、user_status表
        userAccountMapper.deleteUser(tutorIdentificationCode);
    }

    @Override
    public Map<String, Object> login(UserInfosDto userInfosDto)
            throws UnsupportedEncodingException, NoSuchAlgorithmException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar nowTime = Calendar.getInstance();
        Date now = nowTime.getTime();
        //日志信息
        LogTracker logTracker = new LogTracker();
        logTracker.setAction(ActionEnum.LOGIN.name());
        logTracker.setCreateTime(now);

        Md5passWd md5passWd = new Md5passWd();
        String str = md5passWd.passWdMd5(userInfosDto.passwd);

        Map<String, Object> map = new HashMap<>();
        UserAccount userAccounts = getUserAccount(userInfosDto);

        if (userAccounts != null) {
            logTracker.setOperatorId(userAccounts.getId());
            //用户状态信息
            UserStatusExample userStatusExample = new UserStatusExample();
            userStatusExample.createCriteria().andUserIdEqualTo(userAccounts.getId());
            List<UserStatus> userStatuses = userStatusMapper.selectByExample(userStatusExample);
            UserStatus userStatus;

            if(userStatuses == null || userStatuses.size() < 1){
                //没有用户状态信息时，添加新的记录
                userStatus = new UserStatus();
                //默认正常
                userStatus.setAccountStatus("0");
                userStatus.setLastTime(now);
                //默认在岗
                userStatus.setWorkStatus("0");
                userStatus.setUserId(userAccounts.getId());
                userStatus.setNumOfException(0);
                userStatus.setUnlockTime(null);
                userStatusMapper.insert(userStatus);
            }else {
                userStatus = userStatuses.get(0);
            }

            //如果用户状态异常次数大于等于3次，则判断
            if(userStatus.getNumOfException() >= 3){
                //如果当前时间比解锁时间早，则不允许登录
                if(now.compareTo(userStatus.getUnlockTime()) < 0){
                    throw new AppException(ErrorCode.NO_RIGHTS,"由于账号连续登录失败三次,账号已被封禁至"+sdf.format(userStatus.getUnlockTime())+",请稍后再试!");
                }
            }

            if (userAccounts.getPasswd().equals(str)) {
                //密码正确，封装返回参数
                packLoginParam(userAccounts,map);
                logTracker.setDescr(logTrackerService
                        .logInfo(userInfosDto.getUsername(), ActionEnum.LOGIN.getMsg(), ActionStatusEnum.SUCCESS.getMsg(),
                                null));
                logTracker.setOperationStatus("0");
                logTrackerService.saveLog(logTracker);
                //正常登录，需要将用户状态表的异常次数清0
                userStatus.setNumOfException(0);
                userStatus.setLastTime(now);
                userStatus.setAccountStatus("0");
                //清空锁定用户时间
                userStatus.setUnlockTime(null);
                userStatusMapper.updateByPrimaryKey(userStatus);
            } else {
                //密码错误,记录日志，并更新用户状态信息表
                logTracker.setDescr(logTrackerService.logInfo(userInfosDto.getUsername(), ActionEnum.LOGIN.getMsg(),
                        ActionStatusEnum.FAILURE.getMsg(), "密码错误"));
                logTracker.setOperationStatus("1");
                logTrackerService.saveLog(logTracker);

                int wrongNum = userStatus.getNumOfException();
                int newWrongNum = 0;
                if(wrongNum == 0){
                    //第一次错误，异常次数直接加1
                    newWrongNum = wrongNum + 1;
                }else {
                    //非第一次错误，查看上次错误的时间，若间隔小于等于1分钟，则异常次数直接加1
                    if(getDatePoor(now,userStatus.getLastTime()) <= 1){
                        newWrongNum = wrongNum + 1;
                    }else {
                        //间隔大于1分钟则初始化异常次数
                        newWrongNum = 1;
                    }
                }

                if(newWrongNum >= 3){
                    //账号锁定并设置解锁时间为30分钟后
                    userStatus.setAccountStatus("1");
                    nowTime.add(Calendar.MINUTE, 30);
                    Date after = nowTime.getTime();
                    userStatus.setUnlockTime(after);
                }
                userStatus.setLastTime(now);
                userStatus.setNumOfException(newWrongNum);
                userStatusMapper.updateByPrimaryKey(userStatus);
                throw new AppException(ErrorCode.ERR_PWD, "用户名或密码错误!");
            }
        } else {
            logTracker.setDescr(logTrackerService
                    .logInfo(userInfosDto.getUsername(), ActionEnum.LOGIN.getMsg(), ActionStatusEnum.FAILURE.getMsg(),
                            "账号不存在"));
            logTracker.setOperationStatus("1");
            logTrackerService.saveLog(logTracker);
            throw new AppException(ErrorCode.ERR_PWD, "用户名或密码错误!");
        }
        return map;
    }

    @Override
    public List<UserAccount> getAlluser() {
        return userAccountMapper.selectAll();
    }

    /**
     * 编辑用户信息
     */
    @Override
    public UserAccount userUpdata(UserAccount userAccount) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (userAccount.getId() == null || userAccount.getId() < 1) {
            if (StringUtils.isBlank(userAccount.getUsername())) {
                throw new AppException(ErrorCode.ERR_PARAM);
            } else {
                UserAccountExample example = new UserAccountExample();
                example.createCriteria().andUsernameEqualTo(userAccount.getUsername());
                List<UserAccount> userAccounts = userAccountMapper.selectByExample(example);
                if (userAccounts == null || userAccounts.size() < 1) {
                    throw new AppException(ErrorCode.NOT_EXIST);
                }
                userAccount.setId(userAccounts.get(0).getId());
            }
        }
        UserAccountExample example = new UserAccountExample();
        example.createCriteria().andUsernameEqualTo(userAccount.getUsername());
        List<UserAccount> userAccounts1 = userAccountMapper.selectByExample(example);
        if (userAccounts1 == null || userAccounts1.size() < 1) {
            throw new AppException(ErrorCode.ERR_BIZ);
        }
        userAccount.setPasswd(userAccounts1.get(0).getPasswd());
        userAccountMapper.updateByPrimaryKey(userAccount);

        //更新表1-1-1的数据
        DoctorTutorInformation111Example doctorTutorInformation111Example = new DoctorTutorInformation111Example();
        doctorTutorInformation111Example.createCriteria().andTutorIdentificationCodeEqualTo(userAccount.getUsername());
        List<DoctorTutorInformation111> doctorTutorInformation111List =
                doctorTutorInformation111Mapper.selectByExample(doctorTutorInformation111Example);
        if (doctorTutorInformation111List != null || doctorTutorInformation111List.size() > 0) {
            DoctorTutorInformation111 doctorTutorInformation111 = doctorTutorInformation111List.get(0);
            doctorTutorInformation111.setLastTime(sdf.format(new Date()));
            doctorTutorInformation111.setName(userAccount.getRealname());
            doctorTutorInformation111.setCollege(userAccount.getFaculty());
            doctorTutorInformation111Mapper.updateByPrimaryKey(doctorTutorInformation111);
        }
        //消除密码
        userAccount.setPasswd(null);
        return userAccount;
    }

    /**
     * 根据学院和角色查询用户
     */
    @Override
    public List<UserAccountVo> selectCollegeUser(UserTypeDto userTypeDto) {
        //研究生院秘书展示所有用户,院系秘书展示当前院系下所有博导用户（前端传参控制）
        List<UserAccountVo> vos = userAccountMapper.getAllUser(userTypeDto);
        return vos;
    }

    @Override
    public Boolean adduserAccount(UserAccount userAccount) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (userAccount.getId() == null) {
            Date now = new Date();
            String nowDate = sdf.format(now);
            //新增
            UserAccountExample example = new UserAccountExample();
            example.createCriteria().andUsernameEqualTo(userAccount.getUsername());
            List<UserAccount> userAccounts = userAccountMapper.selectByExample(example);
            if (userAccounts != null && userAccounts.size() > 0) {
                throw new AppException(ErrorCode.ERR_EXISTED, "当前用户已存在，请勿重复添加");
            }
            userAccount.setPasswd("CL3qBQCVKuiGfZzp38i0Ww==");
            userAccountMapper.insert(userAccount);

            //初始化其他表
            DoctorTutorInformation111 doctorTutorInformation111 = new DoctorTutorInformation111();
            doctorTutorInformation111.setIsdelete("0");
            doctorTutorInformation111.setTutorIdentificationCode(userAccount.getUsername());
            doctorTutorInformation111.setName(userAccount.getRealname());
            doctorTutorInformation111.setCollege(userAccount.getFaculty());
            doctorTutorInformation111.setLastTime(nowDate);
            doctorTutorInformation111Mapper.insert(doctorTutorInformation111);

            DoctorTutorInformation111Xu1 doctorTutorInformation111Xu1 = new DoctorTutorInformation111Xu1();
            doctorTutorInformation111Xu1.setIsdelete("0");
            doctorTutorInformation111Xu1.setTutorIdentificationCode(userAccount.getUsername());
            doctorTutorInformation111Xu1.setLastTime(nowDate);
            doctorTutorInformation111Xu1Mapper.insert(doctorTutorInformation111Xu1);

            DoctorTutorInformation111Xu2 doctorTutorInformation111Xu2 = new DoctorTutorInformation111Xu2();
            doctorTutorInformation111Xu2.setIsdelete("0");
            doctorTutorInformation111Xu2.setTutorIdentificationCode(userAccount.getUsername());
            doctorTutorInformation111Xu2.setLastTime(nowDate);
            doctorTutorInformation111Xu2Mapper.insert(doctorTutorInformation111Xu2);

            ConfirmInformation confirmInformation = new ConfirmInformation();
            confirmInformation.setTutorIdentificationCode(userAccount.getUsername());
            confirmInformation.setTableConfirm111("0");
            confirmInformation.setTableConfirm111xu1("0");
            confirmInformation.setTableConfirm111xu2("0");
            confirmInformation.setTableConfirm112("0");
            confirmInformation.setTableConfirm121("0");
            confirmInformation.setTableConfirm211("0");
            confirmInformation.setTableConfirm212("0");
            confirmInformation.setTableConfirm213("0");
            confirmInformation.setTableConfirm214("0");
            confirmInformation.setTableConfirm215("0");
            confirmInformation.setTableConfirm221("0");
            confirmInformation.setTableConfirm222("0");
            confirmInformation.setTableConfirm223("0");
            confirmInformation.setTableConfirm224("0");
            confirmInformation.setTableConfirm225("0");
            confirmInformation.setTableConfirm226("0");
            confirmInformation.setTableConfirm227("0");
            confirmInformation.setTotalConfirm("0");

            confirmInformation.setTableTime111(nowDate);
            confirmInformation.setTableTime111xu1(nowDate);
            confirmInformation.setTableTime111xu2(nowDate);
            confirmInformation.setTableTime112(nowDate);
            confirmInformation.setTableTime121(nowDate);
            confirmInformation.setTableTime211(nowDate);
            confirmInformation.setTableTime212(nowDate);
            confirmInformation.setTableTime213(nowDate);
            confirmInformation.setTableTime214(nowDate);
            confirmInformation.setTableTime215(nowDate);
            confirmInformation.setTableTime221(nowDate);
            confirmInformation.setTableTime222(nowDate);
            confirmInformation.setTableTime223(nowDate);
            confirmInformation.setTableTime224(nowDate);
            confirmInformation.setTableTime225(nowDate);
            confirmInformation.setTableTime226(nowDate);
            confirmInformation.setTableTime227(nowDate);
            confirmInformation.setTotalTime(nowDate);

            confirmInformationMapper.insert(confirmInformation);
        }
        return true;

    }

    @Override
    public void userUpdatapw(UserAccount userAccount) {
        UserAccountExample example = new UserAccountExample();
        UserAccountExample.Criteria criteria = example.createCriteria();

        criteria.andIdEqualTo(userAccount.getId());
        //criteria.andPasswdEqualTo(userAccount.getPasswd());
        userAccountMapper.updateByExampleSelective(userAccount, example);
    }

    /**
     * 解除账号锁定
     */
    @Override
    public void unlockAccount(Integer userId){
        UserStatusExample example = new UserStatusExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<UserStatus> list = userStatusMapper.selectByExample(example);
        UserStatus userStatus;
        //不存在用户状态记录
        if(list == null || list.size() < 1){
            //给用户初始化状态
            userStatus = new UserStatus();
            userStatus.setWorkStatus("0");
            userStatus.setLastTime(new Date());
            userStatus.setUserId(userId);
            userStatus.setAccountStatus("0");
            userStatus.setNumOfException(0);
            userStatus.setUnlockTime(null);
            userStatusMapper.insert(userStatus);
        }else {
            userStatus = list.get(0);
            userStatus.setNumOfException(0);
            userStatus.setUnlockTime(null);
            userStatus.setAccountStatus("0");
            userStatusMapper.updateByPrimaryKey(userStatus);
        }
    }

    /**
     * 封装登录返参
     * @param userAccounts
     * @param map
     */
    public void packLoginParam(UserAccount userAccounts,Map<String, Object> map){
        Map<String, String> payload = new HashMap<>();
        payload.put("username", userAccounts.getUsername());
        payload.put("passwd", userAccounts.getPasswd());
        payload.put("faculty", userAccounts.getFaculty());
        payload.put("faculty_code", userAccounts.getFacultyCode());
        payload.put("realname", userAccounts.getRealname());
        payload.put("id", userAccounts.getId().toString());
        payload.put("role", userAccounts.getRole().toString());

        //生成JWT的令牌
        String token = JWTUtils.getToken(payload);
        map.put("state", true);
        map.put("msg", "认证成功");
        map.put("token", token);//响应token
        map.put("username", userAccounts.getUsername());
        map.put("faculty", userAccounts.getFaculty());
        map.put("faculty_code", userAccounts.getFacultyCode());
        map.put("realname", userAccounts.getRealname());
        map.put("id", userAccounts.getId().toString());
        map.put("role", userAccounts.getRole().toString());
    }

    //获取时间差
    public Long getDatePoor(Date endDate, Date nowDate) {

        long nd = 1000 * 24 * 60 * 60;
        long nh = 1000 * 60 * 60;
        long nm = 1000 * 60;
        // long ns = 1000;
        // 获得两个时间的毫秒时间差异
        long diff = endDate.getTime() - nowDate.getTime();
//        // 计算差多少天
//        long day = diff / nd;
//        // 计算差多少小时
//        long hour = diff % nd / nh;
        // 计算差多少分钟
        long min = diff % nd % nh / nm;
        return min;
    }

}
