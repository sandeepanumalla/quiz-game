package com.leaguex.quizgame.services;

import com.leaguex.quizgame.Requests.CreateRoomRequest;
import com.leaguex.quizgame.Requests.RoomJoinRequest;
import com.leaguex.quizgame.model.Room;
import java.util.List;

public interface RoomService {

    public Room createNewRoom(CreateRoomRequest request);

    public void joinRoom(RoomJoinRequest roomJoinRequest) throws Exception;

    public void leaveRoom();

    public List<Room> getAvailableRooms();

    public void updateRoomStatus(long roomId);
}
