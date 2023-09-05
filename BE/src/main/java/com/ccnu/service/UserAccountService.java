package com.ccnu.service;

import com.ccnu.pojo.UserAccount;
import com.ccnu.pojo.dto.UserInfosDto;
import com.ccnu.pojo.dto.UserTypeDto;
import com.ccnu.pojo.vo.UserAccountVo;
import com.ccnu.utils.AppException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 王新强
 * @version 1.0
 * @date 2020/12/22 22:31
 */
public interface UserAccountService {


    UserAccount getUserAccount(UserInfosDto userInfosDto);

    Map<String, Object> login(UserInfosDto userInfosDto) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    //查询所有用户
    List<UserAccount> getAlluser();


    UserAccount userUpdata(UserAccount userAccount);

    List<UserAccountVo> selectCollegeUser(UserTypeDto userTypeDto);

    Boolean adduserAccount(UserAccount userAccount);

    void userUpdatapw(UserAccount userAccount);


    //解除账号锁定
    void unlockAccount(Integer userId);

    /**
     * 删除用户
     */
    void deleteUser(String tutorIdentificationCode);

}
