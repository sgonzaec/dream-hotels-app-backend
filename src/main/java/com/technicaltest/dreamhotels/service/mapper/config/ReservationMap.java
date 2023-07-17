package com.technicaltest.dreamhotels.service.mapper.config;

import com.technicaltest.dreamhotels.domain.dto.ReservationDTO;
import com.technicaltest.dreamhotels.domain.entity.Reservation;
import org.modelmapper.PropertyMap;

public class ReservationMap extends PropertyMap<Reservation, ReservationDTO> {
    @Override
    protected void configure() {
        map().setCustomerId(source.getCustomer().getCustomerId());
        map().setHotelId(source.getHotel().getHotelId());
        map().setTravelAgencyId(source.getTravelAgency().getTravelAgencyId());
        map().setRoomId(source.getRoom().getRoomId());
    }
}
