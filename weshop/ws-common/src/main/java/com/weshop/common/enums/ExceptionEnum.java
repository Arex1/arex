package com.weshop.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.weshop.common.enums
 * 2019/7/27
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {

    ERROR_MASSAGE(400,"数据不能为空！！");

    private int code;
    private String msg;
}
