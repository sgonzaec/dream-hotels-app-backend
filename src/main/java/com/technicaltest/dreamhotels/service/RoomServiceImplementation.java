package com.technicaltest.dreamrooms.service;


import com.technicaltest.dreamhotels.domain.Room;
import com.technicaltest.dreamhotels.repository.IRoomRepository;
import com.technicaltest.dreamhotels.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImplementation implements IRoomService {
    @Autowired
    IRoomRepository iRoomRepository;
    @Override
    public Room insertRoom(Room room) {
        return iRoomRepository.save(room);
    }

    @Override
    public void deleteRoomById(Long id) {
        iRoomRepository.deleteById(id);
    }

    @Override
    public Room updateRoom(Room room) {
        Room response = iRoomRepository.getReferenceById(room.getRoomId());
        iRoomRepository.deleteById(room.getRoomId());
        return iRoomRepository.save(room);
    }

    @Override
    public List<Room> getAllRooms(Room product) {
        return iRoomRepository.findAll();
    }

    @Override
    public Room getRoomById(Long id) {
        return iRoomRepository.getReferenceById(id);
    }
}
