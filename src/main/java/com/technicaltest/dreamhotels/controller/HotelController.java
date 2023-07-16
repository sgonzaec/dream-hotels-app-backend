package com.technicaltest.dreamhotels.controller;

import com.technicaltest.dreamhotels.domain.Hotel;
import com.technicaltest.dreamhotels.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/hotel")
public class HotelController {
    private final IHotelService iHotelService;

    @Autowired
    public HotelController(IHotelService hotelService) {
        this.iHotelService = hotelService;
    }
    @GetMapping("/{id}")
    public Hotel getHotelById(@PathVariable Long id) {
        return iHotelService.getHotelById(id);
    }

    @GetMapping
    public List<Hotel> getAllHotels() {
        return iHotelService.getAllHotels();
    }
    @PostMapping
    public Hotel postHotel(@RequestBody Hotel hotel) {
        return iHotelService.insertHotel(hotel);
    }
    @PutMapping
    public Hotel putHotel(@RequestBody Hotel hotel) {
        return iHotelService.updateHotel(hotel);
    }
    @DeleteMapping("/{id}")
    public void deleteHotel(@PathVariable Long id) {
        iHotelService.deleteHotelById(id);
    }
}
