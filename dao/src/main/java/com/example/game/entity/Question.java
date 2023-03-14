package com.example.game.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName
public class Question {

    @TableId(value = "question_id")
    private Long questionId;

    @TableField(value = "content")
    private String content;

    @TableField(value = "answer1")
    private String answer1;

    @TableField(value = "answer2")
    private String answer2;

    @TableField(value = "answer3")
    private String answer3;

    @TableField(value = "answer4")
    private String answer4;

    @TableField(value = "correct")
    private String correct;
}