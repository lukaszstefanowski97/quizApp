package com.example.quiz.repositories;

import com.example.quiz.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HmRepository extends JpaRepository<Question, Long> {
}
