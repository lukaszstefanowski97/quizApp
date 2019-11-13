package com.example.quiz.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;


import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Answer {

    @Id
    @GeneratedValue
    private Long Id;

    private String answer;

    private Boolean isCorrect;

    @JoinColumn(name = "question", referencedColumnName = "id")
    @ManyToOne
    private Question question;
}
