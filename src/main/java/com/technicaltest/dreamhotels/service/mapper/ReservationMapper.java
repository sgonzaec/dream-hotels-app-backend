package com.technicaltest.dreamhotels.service.mapper;
import com.technicaltest.dreamhotels.domain.dto.ReservationDTO;
import com.technicaltest.dreamhotels.domain.entity.Reservation;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ReservationMapper
{
    private final ModelMapper modelMapper;
    public ReservationMapper() {
        this.modelMapper = new ModelMapper();
    }

    public ReservationDTO convertToDTO(Reservation reservation) {
        return modelMapper.map(reservation, ReservationDTO.class);
    }

    public Reservation convertToEntity(ReservationDTO reservationDTO) {
        return modelMapper.map(reservationDTO, Reservation.class);
    }
}
