package com.technicaltest.dreamhotels.service;

import com.technicaltest.dreamhotels.domain.TravelAgency;

import java.util.List;

public interface ITravelAgencyService {
    public TravelAgency insertTravelAgency(TravelAgency travelAgency);
    public void deleteTravelAgencyById(Long id);
    public TravelAgency updateTravelAgency(TravelAgency travelAgency);
    public List<TravelAgency> getAllTravelAgencys();
    public TravelAgency getTravelAgencyById(Long id);



}
