package com.technicaltest.dreamhotels.controller;


import com.technicaltest.dreamhotels.domain.Reservation;
import com.technicaltest.dreamhotels.service.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/reservation")
public class ReservationController {
    @Autowired(required=true)
    private IReservationService iReservationService;
    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable Long id) {
        return iReservationService.getReservationById(id);
    }

    @GetMapping("")
    public List<Reservation> getAllReservations() {
        return iReservationService.getAllReservations();
    }
    @PostMapping
    public Reservation postReservation(@RequestBody Reservation reservation) {
        return iReservationService.insertReservation(reservation);
    }
    @PutMapping
    public Reservation putReservation(@RequestBody Reservation reservation) {
        return iReservationService.updateReservation(reservation);
    }
    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable Long id) {
        iReservationService.deleteReservationById(id);
    }
}
