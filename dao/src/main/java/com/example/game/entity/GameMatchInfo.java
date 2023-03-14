package com.example.game.entity;

import lombok.Data;

import java.util.List;


@Data
public class GameMatchInfo {

    private UserMatchInfo selfInfo;
    private UserMatchInfo opponentInfo;
    private List<Object> questions;
}
