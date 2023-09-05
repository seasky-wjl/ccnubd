package com.ccnu.pojo;

import java.io.Serializable;

public class UserAccount implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String passwd;

    /**
     * 
     */
    private Integer role;

    /**
     * 
     */
    private String realname;

    /**
     * 
     */
    private String faculty;

    /**
     * 
     */
    private String facultyCode;

    /**
     * user_account
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
     * @return username 
     */
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @param username 
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 
     * @return passwd 
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * 
     * @param passwd 
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    /**
     * 
     * @return role 
     */
    public Integer getRole() {
        return role;
    }

    /**
     * 
     * @param role 
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    /**
     * 
     * @return realname 
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 
     * @param realname 
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * 
     * @return faculty 
     */
    public String getFaculty() {
        return faculty;
    }

    /**
     * 
     * @param faculty 
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty == null ? null : faculty.trim();
    }

    /**
     * 
     * @return faculty_code 
     */
    public String getFacultyCode() {
        return facultyCode;
    }

    /**
     * 
     * @param facultyCode 
     */
    public void setFacultyCode(String facultyCode) {
        this.facultyCode = facultyCode == null ? null : facultyCode.trim();
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
        sb.append(", username=").append(username);
        sb.append(", passwd=").append(passwd);
        sb.append(", role=").append(role);
        sb.append(", realname=").append(realname);
        sb.append(", faculty=").append(faculty);
        sb.append(", facultyCode=").append(facultyCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}