package com.weshop.common.exception;

import com.weshop.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.weshop.common.exception
 * 2019/7/27
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class WeShopException extends RuntimeException{

    private ExceptionEnum exceptionEnum;
}
