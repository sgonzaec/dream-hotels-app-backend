package com.technicaltest.dreamhotels.service;


import com.technicaltest.dreamhotels.domain.Reservation;
import com.technicaltest.dreamhotels.repository.IReservationRepository;
import com.technicaltest.dreamhotels.service.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImplementation implements IReservationService {
    @Autowired
    IReservationRepository iReservationRepository;
    @Override
    public Reservation insertReservation(Reservation reservation) {
        return iReservationRepository.save(reservation);
    }

    @Override
    public void deleteReservationById(Long id) {
        iReservationRepository.deleteById(id);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        Reservation response = iReservationRepository.getReferenceById(reservation.getReservationId());
        iReservationRepository.deleteById(reservation.getReservationId());
        return iReservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return iReservationRepository.findAll();
    }

    @Override
    public Reservation getReservationById(Long id) {
        return iReservationRepository.getReferenceById(id);
    }
}
