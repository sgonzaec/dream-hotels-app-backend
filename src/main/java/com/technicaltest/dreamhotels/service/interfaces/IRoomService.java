package com.technicaltest.dreamhotels.service.interfaces;

import com.technicaltest.dreamhotels.domain.dto.RoomDTO;
import com.technicaltest.dreamhotels.domain.entity.Room;

import java.util.List;

public interface IRoomService {
    public RoomDTO insertRoom(RoomDTO roomDTO);
    public void deleteRoomById(Long id);
    public RoomDTO updateRoom(RoomDTO roomDTO);
    public List<RoomDTO> getAllRooms();
    public RoomDTO getRoomById(Long id);



}
