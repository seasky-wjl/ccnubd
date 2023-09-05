package com.ccnu.pojo;

import java.io.Serializable;

public class SpecializedTechnicalJob implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String specializedTechnicalJob;

    /**
     * 
     */
    private Integer idType;

    /**
     * specialized_technical_job
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
     * @return specialized_technical_job 
     */
    public String getSpecializedTechnicalJob() {
        return specializedTechnicalJob;
    }

    /**
     * 
     * @param specializedTechnicalJob 
     */
    public void setSpecializedTechnicalJob(String specializedTechnicalJob) {
        this.specializedTechnicalJob = specializedTechnicalJob == null ? null : specializedTechnicalJob.trim();
    }

    /**
     * 
     * @return id_type 
     */
    public Integer getIdType() {
        return idType;
    }

    /**
     * 
     * @param idType 
     */
    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    /**
     *
     * @mbggenerated 2020-12-21
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", specializedTechnicalJob=").append(specializedTechnicalJob);
        sb.append(", idType=").append(idType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}