package com.leaguex.quizgame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.leaguex.quizgame.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
