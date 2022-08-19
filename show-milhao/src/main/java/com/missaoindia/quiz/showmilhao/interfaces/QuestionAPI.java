package com.missaoindia.quiz.showmilhao.interfaces;

import com.missaoindia.quiz.showmilhao.model.Question;
import com.missaoindia.quiz.showmilhao.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class QuestionAPI {

    @Autowired
    QuestionRepository questionRepository;

    @GetMapping("/questions")
    public List<Question> listQuestions(){
        return questionRepository.findAll();
    }

    @GetMapping("/questions/{id}")
    public Question findQuestion(@PathVariable Long id){
        return questionRepository.findById(id).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND
        ));
    }

    @PostMapping("/questions")
    public Question createQuestion(@RequestBody Question question){
        return questionRepository.save(question);
    }
}
