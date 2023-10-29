package com.leaguex.quizgame.Requests;

import lombok.Data;

@Data
public class RoomJoinRequest {
    private String username;
    private long roomId;
}
