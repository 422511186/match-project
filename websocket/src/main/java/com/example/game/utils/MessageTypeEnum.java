package com.example.game.utils;

/**
 * websocket发送的消息类型 type
 */
public enum MessageTypeEnum {

    /**
     * 用户加入
     */
    ADD_USER,
    /**
     * 匹配对手
     */
    MATCH_USER,
    /**
     * 取消匹配
     */
    CANCEL_MATCH,
    /**
     * 游戏开始
     */
    PLAY_GAME,
    /**
     * 游戏结束
     */
    GAME_OVER,
}