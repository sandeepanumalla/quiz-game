package com.leaguex.quizgame.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String question;

    @OneToMany(mappedBy = "questionId", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<Options> options;

    long answer;
}
