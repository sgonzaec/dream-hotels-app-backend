package com.technicaltest.dreamhotels.service.mapper;

import com.technicaltest.dreamhotels.domain.dto.HotelDTO;
import com.technicaltest.dreamhotels.domain.entity.Hotel;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class HotelMapper
{
    private final ModelMapper modelMapper;
    public HotelMapper () {
        this.modelMapper = new ModelMapper();
    }

    public HotelDTO convertToDTO(Hotel hotel) {
        return modelMapper.map(hotel, HotelDTO.class);
    }

    public Hotel convertToEntity(HotelDTO hotelDTO) {
        return modelMapper.map(hotelDTO, Hotel.class);
    }
}
