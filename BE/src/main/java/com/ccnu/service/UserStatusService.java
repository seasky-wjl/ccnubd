package com.ccnu.service;

/**
 * @program: ccnu-bd
 * @description: 用户状态接口
 * @author: lsc
 * @create: 2021-10-28 10:54
 **/
public interface UserStatusService {

    /**
     * 更新用户为下岗状态
     * @param userId
     */
    void updateUserWorkStatus(Integer userId);

    /**
     * 更新用户为在岗状态
     * @param userId
     */
    void updateUserOnWorkStatus(Integer userId);

}
