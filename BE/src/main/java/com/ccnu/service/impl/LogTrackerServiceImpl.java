package com.ccnu.service.impl;

import com.ccnu.mapper.LogTrackerMapper;
import com.ccnu.pojo.LogTracker;
import com.ccnu.pojo.LogTrackerExample;
import com.ccnu.service.LogTrackerService;
import com.ccnu.utils.ActionStatusEnum;
import com.ccnu.utils.AppException;
import com.ccnu.utils.ErrorCode;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: ccnu-bd
 * @description: 日志业务实现类
 * @author: lsc
 * @create: 2021-10-27 19:36
 **/
@Service
public class LogTrackerServiceImpl implements LogTrackerService {

    @Autowired
    private LogTrackerMapper logTrackerMapper;

    @Override
    public void saveLog(LogTracker logTracker) {
        logTrackerMapper.insert(logTracker);
    }

    @Override
    public void updateLog(LogTracker logTracker) {
        if(logTracker.getId() == null || logTracker.getId() < 0){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        logTrackerMapper.updateByPrimaryKey(logTracker);
    }

    @Override
    public List<LogTracker> findLogByUserId(Integer operatorId) {
        if(operatorId == null || operatorId < 1){
            throw new AppException(ErrorCode.ERR_PARAM);
        }
        LogTrackerExample logTrackerExample = new LogTrackerExample();
        logTrackerExample.createCriteria().andOperatorIdEqualTo(operatorId);
        List<LogTracker> logs = logTrackerMapper.selectByExample(logTrackerExample);
        return null;
    }

    @Override
    public String logInfo(String userName, String action,String actionStatus,String reason) {
        StringBuffer sb = new StringBuffer("账号");
        if(actionStatus.equals(ActionStatusEnum.SUCCESS.getMsg())){
            sb.append(userName).append("进行了").append(action).append("操作,").append(actionStatus).append("!");
        }else {
            if(StringUtils.isBlank(reason)){
                reason = "原因不明";
            }
            sb.append(userName).append("进行了").append(action).append("操作,").append(actionStatus).append(",").append("因为").append(reason).append("!");
        }
        return sb.toString();
    }
}
