package com.ccnu.pojo;

import java.io.Serializable;

public class TalentSelectionProject implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String talentSelectionProject;

    /**
     * 
     */
    private Integer idType;

    /**
     * talent_selection_project
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
     * @return talent_selection_project 
     */
    public String getTalentSelectionProject() {
        return talentSelectionProject;
    }

    /**
     * 
     * @param talentSelectionProject 
     */
    public void setTalentSelectionProject(String talentSelectionProject) {
        this.talentSelectionProject = talentSelectionProject == null ? null : talentSelectionProject.trim();
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
        sb.append(", talentSelectionProject=").append(talentSelectionProject);
        sb.append(", idType=").append(idType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}