package com.technicaltest.dreamhotels.service.interfaces;

import com.technicaltest.dreamhotels.domain.dto.TravelAgencyDTO;
import com.technicaltest.dreamhotels.domain.entity.TravelAgency;

import java.util.List;

public interface ITravelAgencyService {
    public TravelAgencyDTO insertTravelAgency(TravelAgencyDTO travelAgencyDTO);
    public void deleteTravelAgencyById(Long id);
    public TravelAgencyDTO updateTravelAgency(TravelAgencyDTO travelAgencyDTO);
    public List<TravelAgencyDTO> getAllTravelAgencys();
    public TravelAgencyDTO getTravelAgencyById(Long id);



}
