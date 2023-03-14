package com.example.game.exception;

import com.example.game.error.GameServerError;


public class GameServerException extends RuntimeException {

    private Integer code;

    private String message;

    public GameServerException(GameServerError error) {
        super(error.getErrorDesc());
        this.code = error.getErrorCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
