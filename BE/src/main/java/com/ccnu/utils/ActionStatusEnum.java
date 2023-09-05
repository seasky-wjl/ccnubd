package com.ccnu.utils;

/**
 * @program: ccnu-bd
 * @description: 操作状态枚举
 * @author: lsc
 * @create: 2021-10-27 20:47
 **/
public enum ActionStatusEnum {
    SUCCESS(0, "操作成功"),FAILURE(1,"操作失败");
    private Integer code;
    private String msg;

    ActionStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
