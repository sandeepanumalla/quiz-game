package com.leaguex.quizgame.Requests;

import lombok.Data;

@Data
public class SignInRequest {
    private String username;
    private String password;
}
