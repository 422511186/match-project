package com.example.game.utils;


import com.example.game.error.GameServerError;
import com.example.game.exception.GameServerException;

/**
 *
 */
public enum StatusEnum {

    /**
     * 待匹配
     */
    IDLE,
    /**
     * 匹配中
     */
    IN_MATCH,
    /**
     * 游戏中
     */
    IN_GAME,
    /**
     * 游戏结束
     */
    GAME_OVER,
    ;

    public static StatusEnum getStatusEnum(String status) {
        switch (status) {
            case "IDLE":
                return IDLE;
            case "IN_MATCH":
                return IN_MATCH;
            case "IN_GAME":
                return IN_GAME;
            case "GAME_OVER":
                return GAME_OVER;
            default:
                throw new GameServerException(GameServerError.MESSAGE_TYPE_ERROR);
        }
    }

    public String getValue() {
        return this.name();
    }
}