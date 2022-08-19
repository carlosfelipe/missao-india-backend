package com.missaoindia.quiz.showmilhao.repository;

import com.missaoindia.quiz.showmilhao.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
