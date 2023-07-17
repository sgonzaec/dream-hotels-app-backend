package com.technicaltest.dreamhotels.service.mapper;
import com.technicaltest.dreamhotels.domain.dto.TravelAgencyDTO;
import com.technicaltest.dreamhotels.domain.entity.TravelAgency;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class TravelAgencyMapper
{
    private final ModelMapper modelMapper;
    public TravelAgencyMapper() {
        this.modelMapper = new ModelMapper();
    }

    public TravelAgencyDTO convertToDTO(TravelAgency travelAgency) {
        return modelMapper.map(travelAgency, TravelAgencyDTO.class);
    }

    public TravelAgency convertToEntity(TravelAgencyDTO travelAgencyDTO) {
        return modelMapper.map(travelAgencyDTO, TravelAgency.class);
    }
}
