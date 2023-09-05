package com.ccnu.pojo;

import java.io.Serializable;

public class SubjectDirectory implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String subjectDirectory;

    /**
     * 
     */
    private Integer idType;

    /**
     * 
     */
    private String dataCode;

    /**
     * subject_directory
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
     * @return subject_directory 
     */
    public String getSubjectDirectory() {
        return subjectDirectory;
    }

    /**
     * 
     * @param subjectDirectory 
     */
    public void setSubjectDirectory(String subjectDirectory) {
        this.subjectDirectory = subjectDirectory == null ? null : subjectDirectory.trim();
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
        sb.append(", subjectDirectory=").append(subjectDirectory);
        sb.append(", idType=").append(idType);
        sb.append(", dataCode=").append(dataCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}