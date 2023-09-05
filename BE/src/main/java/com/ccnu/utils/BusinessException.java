package com.ccnu.utils;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p></p>
 *
 * @author lsc
 * @version 2018/10/26
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 5311776766915996016L;
    /**
     * 异常代码
     */
    private int errorCode = ErrorCode.ERR_BIZ.getCode();
    /**
     * 异常信息
     */
    private String errorMessage;

    public BusinessException(String errorMessage) {
        super(errorMessage);
        this.errorCode = ErrorCode.ERR_BIZ.getCode();
    }

    public BusinessException(ErrorCode restResultEnum,String errorMessage) {
        super(errorMessage);
        this.errorCode = restResultEnum.getCode();
    }

    public BusinessException(String errorMessage, Throwable e) {
        super(errorMessage, e);
        this.errorCode = ErrorCode.ERR_BIZ.getCode();
    }

    public BusinessException(int errorCode, String errorMessage, Throwable e) {
        super(errorMessage, e);
        this.errorCode = errorCode;
    }

    public BusinessException(ErrorCode restResultEnum) {
        super(restResultEnum.getMessage());
        this.errorCode = restResultEnum.getCode();
    }
}
