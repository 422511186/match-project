package com.example.game.service;

import com.example.game.dao.QuestionDao;
import com.example.game.entity.Question;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class QuestionSev {

    @Autowired
    private QuestionDao questionDao;

    /**
     * 获取问题
     */
    public List<Question> getAllQuestion() {
        return questionDao.getAllQuestion();

    }
}
