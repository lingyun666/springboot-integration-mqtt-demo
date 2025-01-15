package com.example.mqtt.common.error;

/**
 * @author lingkong
 * @version 0.1
 * @date 2021/11/25
 */
public interface IErrorInfo {

    /**
     * Get error message.
     * @return error message
     */
    String getErrorMsg();

    /**
     * Get error code.
     * @return error code
     */
    Integer getErrorCode();

}
