package com.technicaltest.dreamhotels.service;


import com.technicaltest.dreamhotels.domain.Hotel;
import com.technicaltest.dreamhotels.repository.IHotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImplementation implements IHotelService{
    @Autowired
    IHotelRepository iHotelRepository;
    @Override
    public Hotel insertHotel(Hotel product) {
        return iHotelRepository.save(product);
    }
}
