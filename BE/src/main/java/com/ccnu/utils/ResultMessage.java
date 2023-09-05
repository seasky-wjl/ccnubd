package com.ccnu.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: bruceliu
 * @Date: 2019/12/9 14:29
 * @QQ:1241488705
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultMessage<T> {

    private int status; //状态码
    private String message; //信息
    private T data;

    public ResultMessage(Integer status, String message) {
        this.status = status;
        this.message = message;
        this.data = null;
    }

    public ResultMessage(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    /**
     * 返回成功构造器
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResultMessage<T> success(T data) {
        return new ResultMessage<T>(ErrorCode.SUCCESS.getCode(), ErrorCode.SUCCESS.getMessage(), data);
    }

    /**
     * 失败构造器
     *
     * @param errorCode
     * @return
     */
    public static <T> ResultMessage<T> fail(ErrorCode errorCode) {
        return new ResultMessage<T>(errorCode.getCode(), errorCode.getMessage());
    }

    /**
     * 失败构造器
     *
     * @param errorCode
     * @param message
     * @return
     */
    public static <T> ResultMessage<T> fail(ErrorCode errorCode, String message) {
        return new ResultMessage<T>(errorCode.getCode(), message);
    }

    /**
     * 失败构造器
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResultMessage<T> fail(ErrorCode errorCode, T data) {
        return new ResultMessage<T>(errorCode.getCode(), errorCode.getMessage(), data);
    }
}
