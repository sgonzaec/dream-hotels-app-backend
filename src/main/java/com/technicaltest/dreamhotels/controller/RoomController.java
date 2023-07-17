package com.technicaltest.dreamhotels.controller;


import com.technicaltest.dreamhotels.domain.dto.RoomDTO;
import com.technicaltest.dreamhotels.domain.entity.Room;
import com.technicaltest.dreamhotels.service.interfaces.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/room")
public class RoomController {
    private final IRoomService iRoomService;

    @Autowired
    public RoomController(IRoomService roomService) {
        this.iRoomService = roomService;
    }
    @GetMapping("/{id}")
    public RoomDTO getRoomById(@PathVariable Long id) {
        return iRoomService.getRoomById(id);
    }

    @GetMapping("")
    public List<RoomDTO> getAllRooms() {
        return iRoomService.getAllRooms();
    }
    @PostMapping
    public RoomDTO postRoom(@RequestBody RoomDTO roomDTO) {
        return iRoomService.insertRoom(roomDTO);
    }
    @PutMapping
    public RoomDTO putRoom(@RequestBody RoomDTO roomDTO) {
        return iRoomService.updateRoom(roomDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteRoom(@PathVariable Long id) {
        iRoomService.deleteRoomById(id);
    }
}
