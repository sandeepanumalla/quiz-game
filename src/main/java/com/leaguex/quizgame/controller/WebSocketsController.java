package com.leaguex.quizgame.controller;

import com.leaguex.quizgame.Requests.RoomJoinRequest;
import com.leaguex.quizgame.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketsController {
    private RoomService roomService;
    private SimpMessagingTemplate messagingTemplate;

    @Autowired
    public WebSocketsController(RoomService roomService) {
        this.roomService = roomService;
    }

    @MessageMapping("/room.join")
    public void joinRoom(@Payload RoomJoinRequest joinRequest) {
//        roomService.joinRoom(joinRequest);

    }

    @MessageMapping("/rooms")
    public void getAvailableRooms() {

    }
}
