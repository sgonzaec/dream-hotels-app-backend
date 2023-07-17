package com.technicaltest.dreamhotels.service.mapper;

import com.technicaltest.dreamhotels.domain.dto.CustomerDTO;
import com.technicaltest.dreamhotels.domain.entity.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper
{
    private final ModelMapper modelMapper;
    public CustomerMapper() {
        this.modelMapper = new ModelMapper();
    }

    public CustomerDTO convertToDTO(Customer customer) {
        return modelMapper.map(customer, CustomerDTO.class);
    }

    public Customer convertToEntity(CustomerDTO customerDTO) {
        return modelMapper.map(customerDTO, Customer.class);
    }
}
