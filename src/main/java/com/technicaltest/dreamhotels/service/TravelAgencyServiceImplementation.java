package com.technicaltest.dreamhotels.service;


import com.technicaltest.dreamhotels.domain.TravelAgency;
import com.technicaltest.dreamhotels.repository.ITravelAgencyRepository;
import com.technicaltest.dreamhotels.service.ITravelAgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelAgencyServiceImplementation implements ITravelAgencyService {
    @Autowired
    ITravelAgencyRepository iTravelAgencyRepository;
    @Override
    public TravelAgency insertTravelAgency(TravelAgency travelAgency) {
        return iTravelAgencyRepository.save(travelAgency);
    }

    @Override
    public void deleteTravelAgencyById(Long id) {
        iTravelAgencyRepository.deleteById(id);
    }

    @Override
    public TravelAgency updateTravelAgency(TravelAgency travelAgency) {
        TravelAgency response = iTravelAgencyRepository.getReferenceById(travelAgency.getTravelAgencyId());
        iTravelAgencyRepository.deleteById(travelAgency.getTravelAgencyId());
        return iTravelAgencyRepository.save(travelAgency);
    }

    @Override
    public List<TravelAgency> getAllTravelAgencys() {
        return iTravelAgencyRepository.findAll();
    }

    @Override
    public TravelAgency getTravelAgencyById(Long id) {
        return iTravelAgencyRepository.getReferenceById(id);
    }
}
