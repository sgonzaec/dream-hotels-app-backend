package com.technicaltest.dreamhotels.service;


import com.technicaltest.dreamhotels.domain.Hotel;
import com.technicaltest.dreamhotels.repository.IHotelRepository;

public class HotelServiceImplementation implements IHotelService{

    IHotelRepository iHotelRepository;
    @Override
    public Hotel insertHotel(Hotel product) {
        return iHotelRepository.save(product);
    }
}
