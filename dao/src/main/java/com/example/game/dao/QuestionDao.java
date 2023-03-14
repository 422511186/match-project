package com.example.game.dao;

import com.example.game.mapper.QuestionMapper;
import com.example.game.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class QuestionDao {

    @Autowired
    private QuestionMapper mapper;

    /**
     * 从数据库获取所有 question
     */
    public List<Question> getAllQuestion() {
        return mapper.selectList(null);
    }
}
