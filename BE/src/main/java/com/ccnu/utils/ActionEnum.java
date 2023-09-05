package com.ccnu.utils;

/**
 * @program: ccnu-bd
 * @description: 操作行为枚举
 * @author: lsc
 * @create: 2021-10-27 19:00
 **/
public enum ActionEnum {

    LOGIN(1, "登录");
    private Integer code;
    private String msg;

    ActionEnum(Integer code, String msg) {
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
