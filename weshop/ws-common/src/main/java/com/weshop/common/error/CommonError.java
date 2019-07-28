package com.weshop.common.error;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.weshop.common.error
 * 2019/7/28
 */
public interface CommonError {
    int getErrCode();
    String getErrMsg();
    CommonError setErrMsg(String errMsg);
}
