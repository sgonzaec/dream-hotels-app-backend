package com.technicaltest.dreamhotels.service;


import com.technicaltest.dreamhotels.domain.Hotel;
import com.technicaltest.dreamhotels.repository.IHotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImplementation implements IHotelService{
    @Autowired
    IHotelRepository iHotelRepository;
    @Override
    public Hotel insertHotel(Hotel hotel) {
        return iHotelRepository.save(hotel);
    }

    @Override
    public void deleteHotelById(Long id) {
        iHotelRepository.deleteById(id);
    }

    @Override
    public Hotel updateHotel(Hotel hotel) {
        Hotel response = iHotelRepository.getReferenceById(hotel.getHotelId());
        iHotelRepository.deleteById(hotel.getHotelId());
        return iHotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels(Hotel product) {
        return iHotelRepository.findAll();
    }

    @Override
    public Hotel getHotelById(Long id) {
        return iHotelRepository.getReferenceById(id);
    }
}
