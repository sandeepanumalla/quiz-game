package com.leaguex.quizgame.Requests;


import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class SignUpRequest {

    @NotEmpty
    private String username;

    @NotEmpty
    private String firstName;


    @NotEmpty
    private String password;
}
