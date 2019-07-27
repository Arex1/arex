package com.weshop.common.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.weshop.common.utils
 * 2019/7/27
 */
@ControllerAdvice
public class CommonExceptionHander {
    /**
     * 进行运行时异常的捕捉并返回
     * @param e
     * @return
     */
    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<String> handerException(RuntimeException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }
}
