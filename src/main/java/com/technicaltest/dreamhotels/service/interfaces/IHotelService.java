package com.technicaltest.dreamhotels.service.interfaces;

import com.technicaltest.dreamhotels.domain.dto.HotelDTO;
import com.technicaltest.dreamhotels.domain.entity.Hotel;

import java.util.List;

public interface IHotelService {
    public HotelDTO insertHotel(HotelDTO hotel);
    public void deleteHotelById(Long id);
    public HotelDTO updateHotel(HotelDTO hotel);
    public List<HotelDTO> getAllHotels();
    public HotelDTO getHotelById(Long id);



}
