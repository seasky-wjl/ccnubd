package com.ccnu.utils;


import java.io.IOException;
import javax.servlet.ServletException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author lsc
 * @date 2020/12/4
 */
@ControllerAdvice
@RestControllerAdvice
public class GlobalExceptionHandlerAdvice {

    /**
     * 统一处理验证失败的提示信息
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultMessage methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        return ResultMessage
            .fail(ErrorCode.ERR_BIZ);
    }


    @ExceptionHandler({BusinessException.class,RuntimeException.class, DataIntegrityViolationException.class, ServletException.class, IOException.class})
    public ResultMessage runtimeExceptionHandler(Throwable e) {
        e.printStackTrace();
        return ResultMessage.fail(ErrorCode.ERR_BIZ,e.getMessage());
    }

    @ExceptionHandler({AppException.class})
    public ResultMessage badCredentialsExceptionHandler(AppException e) {
        return ResultMessage.fail(ErrorCode.ERR_BIZ,e.getMessage());
    }

    @ExceptionHandler({Exception.class})
    public ResultMessage badExceptionHandler(Exception e) {
        return ResultMessage.fail(ErrorCode.ERR_BIZ);
    }
}
