package com.example.game.entity;


import com.example.game.utils.MessageTypeEnum;
import lombok.Data;

import java.util.Set;


/**
 * websocket 通信消息类
 *
 */
@Data
public class ChatMessage<T> {

    /**
     * 消息类型
     */
    private MessageTypeEnum type;

    /**
     * 消息发送者
     */
    private String sender;

    /**
     * 消息接收者
     */
    private Set<String> receivers;

    private T data;
}

