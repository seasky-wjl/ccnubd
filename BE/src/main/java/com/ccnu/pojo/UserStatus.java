package com.ccnu.pojo;

import java.io.Serializable;
import java.util.Date;

public class UserStatus implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer userId;

    /**
     * 账户状态，正常0，锁定1
     */
    private String accountStatus;

    /**
     * 工作状态：在岗0，不在岗1
     */
    private String workStatus;

    /**
     * 更新时间，用来判断账户状态
     */
    private Date lastTime;

    /**
     * 异常次数
     */
    private Integer numOfException;

    /**
     * 账户解除锁定的时间
     */
    private Date unlockTime;

    /**
     * user_status
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return user_id 
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId 
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 账户状态，正常0，锁定1
     * @return account_status 账户状态，正常0，锁定1
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * 账户状态，正常0，锁定1
     * @param accountStatus 账户状态，正常0，锁定1
     */
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus == null ? null : accountStatus.trim();
    }

    /**
     * 工作状态：在岗0，不在岗1
     * @return work_status 工作状态：在岗0，不在岗1
     */
    public String getWorkStatus() {
        return workStatus;
    }

    /**
     * 工作状态：在岗0，不在岗1
     * @param workStatus 工作状态：在岗0，不在岗1
     */
    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus == null ? null : workStatus.trim();
    }

    /**
     * 更新时间，用来判断账户状态
     * @return last_time 更新时间，用来判断账户状态
     */
    public Date getLastTime() {
        return lastTime;
    }

    /**
     * 更新时间，用来判断账户状态
     * @param lastTime 更新时间，用来判断账户状态
     */
    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    /**
     * 异常次数
     * @return num_of_exception 异常次数
     */
    public Integer getNumOfException() {
        return numOfException;
    }

    /**
     * 异常次数
     * @param numOfException 异常次数
     */
    public void setNumOfException(Integer numOfException) {
        this.numOfException = numOfException;
    }

    /**
     * 账户解除锁定的时间
     * @return unlock_time 账户解除锁定的时间
     */
    public Date getUnlockTime() {
        return unlockTime;
    }

    /**
     * 账户解除锁定的时间
     * @param unlockTime 账户解除锁定的时间
     */
    public void setUnlockTime(Date unlockTime) {
        this.unlockTime = unlockTime;
    }

    /**
     *
     * @mbggenerated 2021-10-28
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", accountStatus=").append(accountStatus);
        sb.append(", workStatus=").append(workStatus);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", numOfException=").append(numOfException);
        sb.append(", unlockTime=").append(unlockTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}