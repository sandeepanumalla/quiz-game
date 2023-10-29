package com.leaguex.quizgame.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;


@Entity
@Data
@NoArgsConstructor
public class Options {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long optionsId;

    @Transient
    private OptionLetter optionLetter;

    private String optionText;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Question questionId;
}
