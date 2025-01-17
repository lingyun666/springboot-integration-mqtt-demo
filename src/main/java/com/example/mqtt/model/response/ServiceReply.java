package com.example.mqtt.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @author lingkong
 * @version 0.1
 * @date 2021/11/22
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceReply<T> {

    private Integer result;

    private T info;

    private T output;
}
