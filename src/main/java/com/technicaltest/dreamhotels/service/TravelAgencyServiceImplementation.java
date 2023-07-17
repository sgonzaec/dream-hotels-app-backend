package com.technicaltest.dreamhotels.service;


import com.technicaltest.dreamhotels.domain.dto.TravelAgencyDTO;
import com.technicaltest.dreamhotels.domain.entity.TravelAgency;
import com.technicaltest.dreamhotels.domain.entity.TravelAgency;
import com.technicaltest.dreamhotels.repository.ITravelAgencyRepository;
import com.technicaltest.dreamhotels.service.interfaces.ITravelAgencyService;
import com.technicaltest.dreamhotels.service.mapper.TravelAgencyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TravelAgencyServiceImplementation implements ITravelAgencyService {
    @Autowired
    ITravelAgencyRepository iTravelAgencyRepository;
    @Autowired
    TravelAgencyMapper travelAgencyMapper;


    @Override
    public TravelAgencyDTO insertTravelAgency(TravelAgencyDTO travelAgencyDTO) {
        TravelAgency travelAgency = travelAgencyMapper.convertToEntity(travelAgencyDTO);
        return travelAgencyMapper.convertToDTO(iTravelAgencyRepository.save(travelAgency));
    }

    @Override
    public void deleteTravelAgencyById(Long id) {
        iTravelAgencyRepository.deleteById(id);
    }

    @Override
    public TravelAgencyDTO updateTravelAgency(TravelAgencyDTO travelAgencyDTO) {
        TravelAgency travelAgency = travelAgencyMapper.convertToEntity(travelAgencyDTO);
        return travelAgencyMapper.convertToDTO(iTravelAgencyRepository.saveAndFlush(travelAgency));
    }

    @Override
    public List<TravelAgencyDTO> getAllTravelAgencys() {
        List<TravelAgency> travelAgencys = iTravelAgencyRepository.findAll();
        return travelAgencys.stream()
                .map(travelAgencyMapper::convertToDTO)
                .collect(Collectors.toList());
    }
    @Override
    public TravelAgencyDTO getTravelAgencyById(Long id) {
        return travelAgencyMapper.convertToDTO(iTravelAgencyRepository.getReferenceById(id));
    }
}
