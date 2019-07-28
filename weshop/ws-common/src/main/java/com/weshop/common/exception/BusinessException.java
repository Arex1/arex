package com.weshop.common.exception;

import com.weshop.common.error.CommonError;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.weshop.common.exception
 * 2019/7/28
 */
//包装类业务异常实现
public class BusinessException extends Exception implements CommonError {

    private final CommonError commonError;

    public BusinessException(CommonError commonError){
        super();
        this.commonError = commonError;
    }

    public BusinessException(CommonError commonError , String errMsg){
        super();
        this.commonError = commonError;
        this.commonError.setErrMsg(errMsg);
    }

    @Override
    public int getErrCode() {
        return this.commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}
