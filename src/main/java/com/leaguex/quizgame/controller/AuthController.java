package com.leaguex.quizgame.controller;

import com.leaguex.quizgame.Requests.SignInRequest;
import com.leaguex.quizgame.services.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.leaguex.quizgame.controller.RestEndpoints.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;

    @PostMapping(SIGN_IN)
    public void signIn() {

    }

    @PostMapping(SIGN_UP)
    public void signUp(@RequestBody SignInRequest signInRequest) {

    }

    @PostMapping(SIGN_OUT)
    public void signOut() {

    }
}
