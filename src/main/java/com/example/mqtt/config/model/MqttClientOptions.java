package com.example.mqtt.config.model;

import lombok.Data;

/**
 * @author lingkong
 * @version 1.3
 * @date 2023/1/18
 */
@Data
public class MqttClientOptions {

    private MqttProtocolEnum protocol;

    private String host;

    private Integer port;

    private String username;

    private String password;

    private String clientId;

    private String path;

    /**
     * The topic to subscribe to immediately when client connects. Only required for basic link.
     */
    private String inboundTopic;
}
