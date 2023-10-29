package com.leaguex.quizgame.controller;

import com.leaguex.quizgame.Requests.CreateRoomRequest;
import com.leaguex.quizgame.model.Room;
import com.leaguex.quizgame.services.RoomService;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import static com.leaguex.quizgame.controller.RestEndpoints.CREATE_ROOM;
import static com.leaguex.quizgame.controller.RestEndpoints.GET_AVAILABLE_ROOMS;

@RestController
@RequestMapping("/api")
public class RoomController {

    private RoomService roomService;

    private SimpMessagingTemplate messagingTemplate;

    public RoomController(RoomService roomService, SimpMessagingTemplate messagingTemplate) {
        this.roomService = roomService;
        this.messagingTemplate = messagingTemplate;
    }

    @PostMapping(CREATE_ROOM)
    public ResponseEntity<Room> createRoom(@RequestBody CreateRoomRequest createRoomRequest) {
        Room newRoom = roomService.createNewRoom(createRoomRequest);
        messagingTemplate.convertAndSend("/rooms", newRoom);
        return ResponseEntity.ok(newRoom);
    }

    @GetMapping(GET_AVAILABLE_ROOMS)
    public ResponseEntity<?> showAvailableRooms() {
        return ResponseEntity.ok().body(roomService.getAvailableRooms());
    }
}
