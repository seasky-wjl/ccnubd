package com.ccnu.utils;

/**
 * Created by lsc
 */
public enum ErrorCode {

    SUCCESS(200, "成功"),

    ERR_UNKNOWN(101, "未知异常"),
    ERR_SYSTEM(102, "系统异常"),
    ERR_PARAM(103, "参数异常"),
    ERR_TIMEOUT(104, "处理超时"),
    ERR_TIMEOUT_CONNECT(105, "连接超时"),
    ERR_TIMEOUT_SOCKET(106, "链接超时"),
    ERR_BIZ(107, "业务异常"),
    NOT_EXIST(108, "结果不存在"),
    ERR_AUTH(109, "TOKEN异常"),
    ERR_RPC(110, "接口调用异常"),
    ERR_EXISTED(111, "结果已存在"),
    ERR_PWD(112, "密码错误"),
    NO_RIGHTS(113, "没有权限"),
    ERR_RESULT(114, "结果异常"),
    ERR_UPLOAD(115, "上传失败"),
    ERR_VERIFY(116, "验证码错误"),
    ERR_DATA(117, "异常数据"),
    SYS_BUSY(118, "系统繁忙"),
    SYS_PROCESSING(119, "任务处理中"),;

    private final Integer code;
    private final String message;

    ErrorCode(Integer value, String message) {
        this.code = value;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return Integer.toString(code);
    }
}
