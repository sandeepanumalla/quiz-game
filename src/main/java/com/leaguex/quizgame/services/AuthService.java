package com.leaguex.quizgame.services;

import com.leaguex.quizgame.Requests.SignInRequest;
import com.leaguex.quizgame.Requests.SignOutRequest;
import com.leaguex.quizgame.Requests.SignUpRequest;
import com.leaguex.quizgame.model.User;

public interface AuthService {
    public void signIn(SignInRequest signInRequest);
    public void signOut(SignOutRequest signOutRequest);
    public User signUp(SignUpRequest signUpRequest);
}
