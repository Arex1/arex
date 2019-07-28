package com.weshop.common.advice;

import com.weshop.common.exception.BusinessException;
import com.weshop.common.exception.WeShopException;
import com.weshop.common.result.ReturnResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

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
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ReturnResult> handerException(WeShopException e){
        return ResponseEntity.status(e.getExceptionEnum().getCode())
                .body(new ReturnResult(e.getExceptionEnum()));
    }
}
