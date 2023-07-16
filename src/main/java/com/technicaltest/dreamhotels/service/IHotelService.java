package com.technicaltest.dreamhotels.service;

import com.technicaltest.dreamhotels.domain.Hotel;

import java.util.List;

public interface IHotelService {
    public Hotel insertHotel(Hotel product);
    public void deleteHotelById(Long id);
    public Hotel updateHotel(Hotel product);
    public List<Hotel> getAllHotels();
    public Hotel getHotelById(Long id);



}
