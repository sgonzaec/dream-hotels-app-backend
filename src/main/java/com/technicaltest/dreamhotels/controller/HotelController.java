package com.technicaltest.dreamhotels.controller;

import com.technicaltest.dreamhotels.domain.dto.HotelDTO;
import com.technicaltest.dreamhotels.domain.entity.Hotel;
import com.technicaltest.dreamhotels.service.interfaces.IHotelService;
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
    public HotelDTO getHotelById(@PathVariable Long id) {
        return iHotelService.getHotelById(id);
    }

    @GetMapping
    public List<HotelDTO> getAllHotels() {
        return iHotelService.getAllHotels();
    }
    @PostMapping
    public HotelDTO postHotel(@RequestBody HotelDTO hotelDTO) {
        return iHotelService.insertHotel(hotelDTO);
    }
    @PutMapping
    public HotelDTO putHotel(@RequestBody HotelDTO hotelDTO) {
        return iHotelService.updateHotel(hotelDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteHotel(@PathVariable Long id) {
        iHotelService.deleteHotelById(id);
    }
}
