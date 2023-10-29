package com.leaguex.quizgame.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAnswers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long submissionId;

    @OneToOne()
    @JoinColumn(name = "user_id")
    private User user;

    @JoinColumn(name = "question_id")
    @OneToOne
    private Question question;

    @JoinColumn(name = "selected_option")
    @OneToOne
    private Options selectedOption;
}
