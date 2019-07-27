package com.weshop.common.result;

import com.weshop.common.enums.ExceptionEnum;
import lombok.Data;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.weshop.common.result
 * 2019/7/27
 */
@Data
public class ExceptionResult {

    //返回异常的状态
    private int status;
    //返回异常的信息
    private String message;
    //返回异常的时间点
    private Long timestamp;

    public ExceptionResult(ExceptionEnum exceptionEnum){
        this.status = exceptionEnum.getCode();
        this.message = exceptionEnum.getMsg();
        this.timestamp = System.currentTimeMillis();
    }
}
