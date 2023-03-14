package com.example.game.entity;

import lombok.Data;

/**
 * websocket 响应消息类
 *
 */
@Data
public class MessageReply<T> {

    private Integer code;

    private String desc;

    private ChatMessage<T> chatMessage;
}
