package com.technicaltest.dreamhotels.service;


import com.technicaltest.dreamhotels.domain.dto.ReservationDTO;
import com.technicaltest.dreamhotels.domain.entity.Reservation;
import com.technicaltest.dreamhotels.domain.entity.Reservation;
import com.technicaltest.dreamhotels.repository.IReservationRepository;
import com.technicaltest.dreamhotels.service.interfaces.IReservationService;
import com.technicaltest.dreamhotels.service.mapper.ReservationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservationServiceImplementation implements IReservationService {
    @Autowired
    IReservationRepository iReservationRepository;
    @Autowired
    ReservationMapper reservationMapper;


    @Override
    public ReservationDTO insertReservation(ReservationDTO reservationDTO) {
        Reservation reservation = reservationMapper.convertToEntity(reservationDTO);
        return reservationMapper.convertToDTO(iReservationRepository.save(reservation));
    }

    @Override
    public void deleteReservationById(Long id) {
        iReservationRepository.deleteById(id);
    }

    @Override
    public ReservationDTO updateReservation(ReservationDTO reservationDTO) {
        Reservation reservation = reservationMapper.convertToEntity(reservationDTO);
        return reservationMapper.convertToDTO(iReservationRepository.saveAndFlush(reservation));
    }

    @Override
    public List<ReservationDTO> getAllReservations() {
        List<Reservation> reservations = iReservationRepository.findAll();
        return reservations.stream()
                .map(reservationMapper::convertToDTO)
                .collect(Collectors.toList());
    }
    @Override
    public ReservationDTO getReservationById(Long id) {
        return reservationMapper.convertToDTO(iReservationRepository.getReferenceById(id));
    }
}
