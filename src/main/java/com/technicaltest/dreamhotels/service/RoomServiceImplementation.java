package com.technicaltest.dreamhotels.service;


import com.technicaltest.dreamhotels.domain.dto.RoomDTO;
import com.technicaltest.dreamhotels.domain.entity.Room;
import com.technicaltest.dreamhotels.domain.entity.Room;
import com.technicaltest.dreamhotels.repository.IRoomRepository;
import com.technicaltest.dreamhotels.service.interfaces.IRoomService;
import com.technicaltest.dreamhotels.service.mapper.RoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoomServiceImplementation implements IRoomService {
    @Autowired
    IRoomRepository iRoomRepository;
    @Autowired
    RoomMapper roomMapper;


    @Override
    public RoomDTO insertRoom(RoomDTO roomDTO) {
        Room room = roomMapper.convertToEntity(roomDTO);
        return roomMapper.convertToDTO(iRoomRepository.save(room));
    }

    @Override
    public void deleteRoomById(Long id) {
        iRoomRepository.deleteById(id);
    }

    @Override
    public RoomDTO updateRoom(RoomDTO roomDTO) {
        Room room = roomMapper.convertToEntity(roomDTO);
        return roomMapper.convertToDTO(iRoomRepository.saveAndFlush(room));
    }

    @Override
    public List<RoomDTO> getAllRooms() {
        List<Room> rooms = iRoomRepository.findAll();
        return rooms.stream()
                .map(roomMapper::convertToDTO)
                .collect(Collectors.toList());
    }
    @Override
    public RoomDTO getRoomById(Long id) {
        return roomMapper.convertToDTO(iRoomRepository.getReferenceById(id));
    }
}
