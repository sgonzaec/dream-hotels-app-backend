package com.technicaltest.dreamhotels.service.mapper.config;


import com.technicaltest.dreamhotels.domain.dto.RoomDTO;
import com.technicaltest.dreamhotels.domain.entity.Room;
import org.modelmapper.PropertyMap;

public class RoomMap extends PropertyMap<Room, RoomDTO> {
    @Override
    protected void configure() {
        map().setHotelId(source.getHotel().getHotelId());
    }
}
