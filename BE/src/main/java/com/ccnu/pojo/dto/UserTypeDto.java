package com.ccnu.pojo.dto;

/**
 * @program: ccnu-bd
 * @description: 用户类型传参
 * @author: lsc
 * @create: 2021-10-20 16:05
 **/
public class UserTypeDto {

    //用户角色
    private Integer role;

    //用户所属学院code
    private String facultyCode;

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getFacultyCode() {
        return facultyCode;
    }

    public void setFacultyCode(String facultyCode) {
        this.facultyCode = facultyCode;
    }
}
