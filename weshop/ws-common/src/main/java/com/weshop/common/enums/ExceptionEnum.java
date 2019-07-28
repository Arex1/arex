package com.weshop.common.enums;

import com.weshop.common.error.CommonError;
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
public enum ExceptionEnum implements CommonError {

    COMMON_ERROR(10000,"参数不合法"),
    UNKNOWN_ERROR(10001,"未知错误"),
    USER_NOT_EXIST(1000,"用户不存在");

    private int code;
    private String msg;

    @Override
    public int getErrCode() {
        return this.code;
    }

    @Override
    public String getErrMsg() {
        return this.msg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.msg = errMsg;
        return this;
    }
}
