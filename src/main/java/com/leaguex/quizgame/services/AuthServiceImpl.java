package com.leaguex.quizgame.services;

import com.leaguex.quizgame.Requests.SignInRequest;
import com.leaguex.quizgame.Requests.SignOutRequest;
import com.leaguex.quizgame.Requests.SignUpRequest;
import com.leaguex.quizgame.model.User;
import com.leaguex.quizgame.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{

    private final ModelMapper modelMapper;

    private final UserRepository userRepository;

    private final JwtService jwtService;

    public AuthServiceImpl(ModelMapper modelMapper, UserRepository userRepository, JwtService jwtService) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
        this.jwtService = jwtService;
    }

    @Override
    public void signIn(SignInRequest signInRequest) {
        String username = signInRequest.
        jwtService.generateToken(s)
    }

    @Override
    public void signOut(SignOutRequest signOutRequest) {

    }

    @Override
    public User signUp(SignUpRequest signUpRequest) {
        User user = modelMapper.map(signUpRequest, User.class);
        userRepository.save(user);
        return user;
    }
}
