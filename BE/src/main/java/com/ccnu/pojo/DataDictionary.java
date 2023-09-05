package com.ccnu.pojo;

import java.io.Serializable;

public class DataDictionary implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String dataValue;

    /**
     * 
     */
    private String dataType;

    /**
     * 
     */
    private String dataCode;

    /**
     * data_dictionary
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
     * @return data_value 
     */
    public String getDataValue() {
        return dataValue;
    }

    /**
     * 
     * @param dataValue 
     */
    public void setDataValue(String dataValue) {
        this.dataValue = dataValue == null ? null : dataValue.trim();
    }

    /**
     * 
     * @return data_type 
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * 
     * @param dataType 
     */
    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
    }

    /**
     * 
     * @return data_code 
     */
    public String getDataCode() {
        return dataCode;
    }

    /**
     * 
     * @param dataCode 
     */
    public void setDataCode(String dataCode) {
        this.dataCode = dataCode == null ? null : dataCode.trim();
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
        sb.append(", dataValue=").append(dataValue);
        sb.append(", dataType=").append(dataType);
        sb.append(", dataCode=").append(dataCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}