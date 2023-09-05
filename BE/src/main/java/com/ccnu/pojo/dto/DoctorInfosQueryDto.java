package com.ccnu.pojo.dto;

import com.ccnu.utils.PageQuery;

/**
 * @program: ccnu-bd
 * @description: 查询表一博导信息传参
 * @author: lsc
 * @create: 2020-12-04 14:26
 **/
public class DoctorInfosQueryDto extends PageQuery {

    //导师唯一标识码
    private String tutorIdentificationCode;

    //所属学院
    private String college;

    public String getTutorIdentificationCode() {
        return tutorIdentificationCode;
    }

    public void setTutorIdentificationCode(String tutorIdentificationCode) {
        this.tutorIdentificationCode = tutorIdentificationCode;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
