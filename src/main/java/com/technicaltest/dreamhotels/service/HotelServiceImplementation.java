package com.technicaltest.dreamhotels.service;


import com.technicaltest.dreamhotels.domain.dto.HotelDTO;
import com.technicaltest.dreamhotels.domain.entity.Hotel;
import com.technicaltest.dreamhotels.domain.entity.Hotel;
import com.technicaltest.dreamhotels.repository.IHotelRepository;
import com.technicaltest.dreamhotels.repository.IHotelRepository;
import com.technicaltest.dreamhotels.service.interfaces.IHotelService;
import com.technicaltest.dreamhotels.service.mapper.HotelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HotelServiceImplementation implements IHotelService {

    @Autowired
    IHotelRepository iHotelRepository;
    @Autowired
    HotelMapper hotelMapper;


    @Override
    public HotelDTO insertHotel(HotelDTO hotelDTO) {
        Hotel hotel = hotelMapper.convertToEntity(hotelDTO);
        return hotelMapper.convertToDTO(iHotelRepository.save(hotel));
    }

    @Override
    public void deleteHotelById(Long id) {
        iHotelRepository.deleteById(id);
    }

    @Override
    public HotelDTO updateHotel(HotelDTO hotelDTO) {
        Hotel hotel = hotelMapper.convertToEntity(hotelDTO);
        return hotelMapper.convertToDTO(iHotelRepository.saveAndFlush(hotel));
    }

    @Override
    public List<HotelDTO> getAllHotels() {
        List<Hotel> hotels = iHotelRepository.findAll();
        return hotels.stream()
                .map(hotelMapper::convertToDTO)
                .collect(Collectors.toList());
    }
    @Override
    public HotelDTO getHotelById(Long id) {
        return hotelMapper.convertToDTO(iHotelRepository.getReferenceById(id));
    }
}
