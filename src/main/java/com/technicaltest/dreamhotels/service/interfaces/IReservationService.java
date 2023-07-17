package com.technicaltest.dreamhotels.service.interfaces;

import com.technicaltest.dreamhotels.domain.dto.ReservationDTO;
import com.technicaltest.dreamhotels.domain.entity.Reservation;

import java.util.List;

public interface IReservationService {
    public ReservationDTO insertReservation(ReservationDTO reservationDTO);
    public void deleteReservationById(Long id);
    public ReservationDTO updateReservation(ReservationDTO reservationDTO);
    public List<ReservationDTO> getAllReservations();
    public ReservationDTO getReservationById(Long id);



}
