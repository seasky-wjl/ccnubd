package com.ccnu.pojo;

import java.io.Serializable;
import java.util.Date;

public class LogTracker implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 操作人id
     */
    private Integer operatorId;

    /**
     * 操作行为
     */
    private String action;

    /**
     * 操作描述
     */
    private String descr;

    /**
     * 操作时间
     */
    private Date createTime;

    /**
     * 操作状态，成功0，失败1
     */
    private String operationStatus;

    /**
     * log_tracker
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 操作人id
     * @return operator_id 操作人id
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * 操作人id
     * @param operatorId 操作人id
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 操作行为
     * @return action 操作行为
     */
    public String getAction() {
        return action;
    }

    /**
     * 操作行为
     * @param action 操作行为
     */
    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    /**
     * 操作描述
     * @return descr 操作描述
     */
    public String getDescr() {
        return descr;
    }

    /**
     * 操作描述
     * @param descr 操作描述
     */
    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    /**
     * 操作时间
     * @return create_time 操作时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 操作时间
     * @param createTime 操作时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 操作状态，成功0，失败1
     * @return operation_status 操作状态，成功0，失败1
     */
    public String getOperationStatus() {
        return operationStatus;
    }

    /**
     * 操作状态，成功0，失败1
     * @param operationStatus 操作状态，成功0，失败1
     */
    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus == null ? null : operationStatus.trim();
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
        sb.append(", operatorId=").append(operatorId);
        sb.append(", action=").append(action);
        sb.append(", descr=").append(descr);
        sb.append(", createTime=").append(createTime);
        sb.append(", operationStatus=").append(operationStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}