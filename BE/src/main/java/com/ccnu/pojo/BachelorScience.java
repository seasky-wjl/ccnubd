package com.ccnu.pojo;

import java.io.Serializable;

public class BachelorScience implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String bachelorScience;

    /**
     * 
     */
    private Integer idType;

    /**
     * bachelor_science
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
     * @return bachelor_science 
     */
    public String getBachelorScience() {
        return bachelorScience;
    }

    /**
     * 
     * @param bachelorScience 
     */
    public void setBachelorScience(String bachelorScience) {
        this.bachelorScience = bachelorScience == null ? null : bachelorScience.trim();
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
        sb.append(", bachelorScience=").append(bachelorScience);
        sb.append(", idType=").append(idType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}