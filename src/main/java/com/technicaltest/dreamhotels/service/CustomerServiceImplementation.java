package com.technicaltest.dreamhotels.service;



import com.technicaltest.dreamhotels.domain.Customer;
import com.technicaltest.dreamhotels.repository.ICustomerRepository;
import com.technicaltest.dreamhotels.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImplementation implements ICustomerService {
    @Autowired
    ICustomerRepository iCustomerRepository;
    @Override
    public Customer insertCustomer(Customer customer) {
        return iCustomerRepository.save(customer);
    }

    @Override
    public void deleteCustomerById(Long id) {
        iCustomerRepository.deleteById(id);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return iCustomerRepository.saveAndFlush(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return iCustomerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Long id) {
        return iCustomerRepository.getReferenceById(id);
    }
}
