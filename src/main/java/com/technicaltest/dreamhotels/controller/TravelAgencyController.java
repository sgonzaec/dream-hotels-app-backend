package com.technicaltest.dreamhotels.controller;


import com.technicaltest.dreamhotels.domain.dto.TravelAgencyDTO;
import com.technicaltest.dreamhotels.domain.entity.TravelAgency;
import com.technicaltest.dreamhotels.service.interfaces.ITravelAgencyService;
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
    public TravelAgencyDTO getTravelAgencyById(@PathVariable Long id) {
        return iTravelAgencyService.getTravelAgencyById(id);
    }

    @GetMapping("")
    public List<TravelAgencyDTO> getAllTravelAgencys() {
        return iTravelAgencyService.getAllTravelAgencys();
    }
    @PostMapping
    public TravelAgencyDTO postTravelAgency(@RequestBody TravelAgencyDTO travelAgencyDTO) {
        return iTravelAgencyService.insertTravelAgency(travelAgencyDTO);
    }
    @PutMapping
    public TravelAgencyDTO putTravelAgency(@RequestBody TravelAgencyDTO travelAgencyDTO) {
        return iTravelAgencyService.updateTravelAgency(travelAgencyDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteTravelAgency(@PathVariable Long id) {
        iTravelAgencyService.deleteTravelAgencyById(id);
    }
}
