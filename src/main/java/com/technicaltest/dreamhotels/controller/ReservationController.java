package com.technicaltest.dreamhotels.controller;


import com.technicaltest.dreamhotels.domain.dto.ReservationDTO;
import com.technicaltest.dreamhotels.domain.entity.Reservation;
import com.technicaltest.dreamhotels.service.interfaces.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/reservation")
public class ReservationController {
    private final IReservationService iReservationService;

    @Autowired
    public ReservationController(IReservationService reservationService) {
        this.iReservationService = reservationService;
    }
    @GetMapping("/{id}")
    public ReservationDTO getReservationById(@PathVariable Long id) {
        return iReservationService.getReservationById(id);
    }

    @GetMapping("")
    public List<ReservationDTO> getAllReservations() {
        return iReservationService.getAllReservations();
    }
    @PostMapping
    public ReservationDTO postReservation(@RequestBody ReservationDTO reservationDTO) {
        return iReservationService.insertReservation(reservationDTO);
    }
    @PutMapping
    public ReservationDTO putReservation(@RequestBody ReservationDTO reservationDTO) {
        return iReservationService.updateReservation(reservationDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable Long id) {
        iReservationService.deleteReservationById(id);
    }
}
