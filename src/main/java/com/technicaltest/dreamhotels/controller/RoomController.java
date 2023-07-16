package com.technicaltest.dreamhotels.controller;


import com.technicaltest.dreamhotels.domain.Room;
import com.technicaltest.dreamhotels.service.ICustomerService;
import com.technicaltest.dreamhotels.service.IRoomService;
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
    public Room getRoomById(@PathVariable Long id) {
        return iRoomService.getRoomById(id);
    }

    @GetMapping("")
    public List<Room> getAllRooms() {
        return iRoomService.getAllRooms();
    }
    @PostMapping
    public Room postRoom(@RequestBody Room room) {
        return iRoomService.insertRoom(room);
    }
    @PutMapping
    public Room putRoom(@RequestBody Room room) {
        return iRoomService.updateRoom(room);
    }
    @DeleteMapping("/{id}")
    public void deleteRoom(@PathVariable Long id) {
        iRoomService.deleteRoomById(id);
    }
}
