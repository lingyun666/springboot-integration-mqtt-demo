package com.example.mqtt.model.request;

import com.example.mqtt.common.error.IErrorInfo;
import com.example.mqtt.common.model.ResponseResult;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lingkong
 * @version 1.1
 * @date 2022/6/13
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestsReply<T> {

    private Integer result;

    private T output;


    public static RequestsReply error(IErrorInfo errorInfo) {
        return RequestsReply.builder()
                .result(errorInfo.getErrorCode())
                .output(errorInfo.getErrorMsg())
                .build();
    }

    public static <T> RequestsReply success(T data) {
        return RequestsReply.builder()
                .result(ResponseResult.CODE_SUCCESS)
                .output(data)
                .build();
    }
    public static RequestsReply success() {
        return RequestsReply.builder()
                .result(ResponseResult.CODE_SUCCESS)
                .build();
    }
}
