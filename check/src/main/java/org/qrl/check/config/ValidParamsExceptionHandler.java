package org.qrl.check.config;

import org.qrl.basic.vo.Result;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: QR
 * @Date: 2021/10/2-21:04
 */
@RestControllerAdvice(basePackages = {"org.qrl.check.controller"})
public class ValidParamsExceptionHandler {

    @ExceptionHandler
    public Result<?> exceptionHandler(MethodArgumentNotValidException e) {
        Map<String, String> map = e.getBindingResult().getFieldErrors().stream()
                .collect(Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage));
        return Result.error("参数出现错误", map);
    }
}
