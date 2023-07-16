package com.technicaltest.dreamhotels.service;

import com.technicaltest.dreamhotels.domain.Room;

import java.util.List;

public interface IRoomService {
    public Room insertRoom(Room room);
    public void deleteRoomById(Long id);
    public Room updateRoom(Room room);
    public List<Room> getAllRooms(Room room);
    public Room getRoomById(Long id);



}
