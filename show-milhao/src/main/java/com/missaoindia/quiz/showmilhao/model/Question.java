package com.missaoindia.quiz.showmilhao.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Data
@Entity
public class Question {

    @Id
    private Long id;
    private String descQuestion;
    private String level;
//    private List<AnswerChoice> answerChoices;

}
