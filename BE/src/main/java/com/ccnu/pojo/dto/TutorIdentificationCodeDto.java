package com.ccnu.pojo.dto;

import com.ccnu.utils.PageQuery;

/**
 * @program: ccnu-bd
 * @description: 导师唯一标识码传参
 * @author: lsc
 * @create: 2021-01-13 11:48
 **/
public class TutorIdentificationCodeDto extends PageQuery {

    //导师唯一标识码
    private String tutorIdentificationCode;

    public String getTutorIdentificationCode() {
        return tutorIdentificationCode;
    }

    public void setTutorIdentificationCode(String tutorIdentificationCode) {
        this.tutorIdentificationCode = tutorIdentificationCode;
    }
}
