package com.leaguex.quizgame.controller;

import com.leaguex.quizgame.Requests.SignUpRequest;
import com.leaguex.quizgame.services.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.leaguex.quizgame.controller.RestEndpoints.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping(SIGN_IN)
    public void signIn() {

    }

    @PostMapping(SIGN_UP)
    public ResponseEntity<String> signUp(@RequestBody SignUpRequest signUpRequest) {
         authService.signUp(signUpRequest);
         return ResponseEntity.ok().body("you have been registered");
    }

    @PostMapping(SIGN_OUT)
    public void signOut() {
        authService.signOut(null);
    }
}
