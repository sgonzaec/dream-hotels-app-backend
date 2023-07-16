package com.technicaltest.dreamhotels.controller;


import com.technicaltest.dreamhotels.domain.TravelAgency;
import com.technicaltest.dreamhotels.service.ICustomerService;
import com.technicaltest.dreamhotels.service.ITravelAgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/travelAgency")
public class TravelAgencyController {
    private final ITravelAgencyService iTravelAgencyService;

    @Autowired
    public TravelAgencyController(ITravelAgencyService travelAgencyService) {
        this.iTravelAgencyService = travelAgencyService;
    }
    @GetMapping("/{id}")
    public TravelAgency getTravelAgencyById(@PathVariable Long id) {
        return iTravelAgencyService.getTravelAgencyById(id);
    }

    @GetMapping("")
    public List<TravelAgency> getAllTravelAgencys() {
        return iTravelAgencyService.getAllTravelAgencys();
    }
    @PostMapping
    public TravelAgency postTravelAgency(@RequestBody TravelAgency travelAgency) {
        return iTravelAgencyService.insertTravelAgency(travelAgency);
    }
    @PutMapping
    public TravelAgency putTravelAgency(@RequestBody TravelAgency travelAgency) {
        return iTravelAgencyService.updateTravelAgency(travelAgency);
    }
    @DeleteMapping("/{id}")
    public void deleteTravelAgency(@PathVariable Long id) {
        iTravelAgencyService.deleteTravelAgencyById(id);
    }
}
