package com.technicaltest.dreamhotels.service;

import com.technicaltest.dreamhotels.domain.Reservation;

import java.util.List;

public interface IReservationService {
    public Reservation insertReservation(Reservation reservation);
    public void deleteReservationById(Long id);
    public Reservation updateReservation(Reservation reservation);
    public List<Reservation> getAllReservations();
    public Reservation getReservationById(Long id);



}
