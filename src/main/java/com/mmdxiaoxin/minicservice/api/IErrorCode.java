package com.mmdxiaoxin.minicservice.api;

/**
 * API返回码接口
 */
public interface IErrorCode {
    /**
     * 返回码
     */
    long getCode();

    /**
     * 返回信息
     */
    String getMessage();
}
