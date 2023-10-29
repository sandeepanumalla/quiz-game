package com.leaguex.quizgame.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roomId;

    private String roomName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<User> usersJoined;

    @Enumerated
    private State state;
}
