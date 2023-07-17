package com.technicaltest.dreamhotels.service;



import com.technicaltest.dreamhotels.domain.dto.CustomerDTO;
import com.technicaltest.dreamhotels.domain.entity.Customer;
import com.technicaltest.dreamhotels.repository.ICustomerRepository;
import com.technicaltest.dreamhotels.service.interfaces.ICustomerService;
import com.technicaltest.dreamhotels.service.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImplementation implements ICustomerService {

    @Autowired
    ICustomerRepository iCustomerRepository;
    @Autowired
    CustomerMapper customerMapper;


    @Override
    public CustomerDTO insertCustomer(CustomerDTO customerDTO) {
        Customer customer = customerMapper.convertToEntity(customerDTO);
        return customerMapper.convertToDTO(iCustomerRepository.save(customer));
    }

    @Override
    public void deleteCustomerById(Long id) {
        iCustomerRepository.deleteById(id);
    }

    @Override
    public CustomerDTO updateCustomer(CustomerDTO customerDTO) {
        Customer customer = customerMapper.convertToEntity(customerDTO);
        return customerMapper.convertToDTO(iCustomerRepository.saveAndFlush(customer));
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> customers = iCustomerRepository.findAll();
        return customers.stream()
                .map(customerMapper::convertToDTO)
                .collect(Collectors.toList());
    }
    @Override
    public CustomerDTO getCustomerById(Long id) {
        return customerMapper.convertToDTO(iCustomerRepository.getReferenceById(id));
    }
}
