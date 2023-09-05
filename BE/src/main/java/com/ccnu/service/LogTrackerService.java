package com.ccnu.service;

import com.ccnu.pojo.LogTracker;
import java.util.List;

/**
 * @program: ccnu-bd
 * @description: 日志业务类
 * @author: lsc
 * @create: 2021-10-27 19:29
 **/
public interface LogTrackerService {

    /**
     * 保存日志信息
     * @param logTracker
     * @return
     */
    public void saveLog(LogTracker logTracker);

    /**
     * 更新日志信息
     * @param logTracker
     * @return
     */
    public void updateLog(LogTracker logTracker);

    /**
     * 根据用户id查找日志
     * @param operatorId
     * @return
     */
    public List<LogTracker> findLogByUserId(Integer operatorId);

    /**
     * 处理日志描述
     * @param userName
     * @param action
     * @return
     */
    public String logInfo(String userName,String action,String actionStatus,String reason);


}
