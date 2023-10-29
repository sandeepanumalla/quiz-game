package com.leaguex.quizgame.services;

import com.leaguex.quizgame.Requests.CreateRoomRequest;
import com.leaguex.quizgame.Requests.RoomJoinRequest;
import com.leaguex.quizgame.model.Room;
import com.leaguex.quizgame.model.State;
import com.leaguex.quizgame.model.User;
import com.leaguex.quizgame.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoomServiceImpl implements RoomService{

    private RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public Room createNewRoom(CreateRoomRequest request) {
        Room newRoom = Room.builder()
                .roomName(request.getRoomName())
                .state(State.WAITING_TO_START) // has to be waiting to start because
                .usersJoined(null)
                .build();
         return newRoom;
    }

    @Override
    public void joinRoom(RoomJoinRequest roomJoinRequest) throws Exception {
        long roomId = roomJoinRequest.getRoomId();
        String username = roomJoinRequest.getUsername();
        Room room = roomRepository.findById(roomId).orElseThrow(() -> new Exception("give roomId is not found"));
        if (room.getUsersJoined().size() == 0) {
            room.setUsersJoined(new ArrayList<>());
        }
//        room.getUsersJoined().add(); // just testing

    }

    @Override
    public void leaveRoom() {

    }

    @Override
    public List<Room> getAvailableRooms() {
        return roomRepository.findAll().stream().filter(room -> room.getState() == State.WAITING_TO_START || room.getState() == State.CREATED).collect(Collectors.toList());
    }

    @Override
    public void updateRoomStatus(long roomId) {

    }
}
