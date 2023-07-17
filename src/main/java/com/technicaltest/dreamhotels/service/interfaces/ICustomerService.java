package com.technicaltest.dreamhotels.service.interfaces;

import com.technicaltest.dreamhotels.domain.dto.CustomerDTO;
import com.technicaltest.dreamhotels.domain.entity.Customer;

import java.util.List;

public interface ICustomerService {
    public CustomerDTO insertCustomer(CustomerDTO customer);
    public void deleteCustomerById(Long id);
    public CustomerDTO updateCustomer(CustomerDTO customer);
    public List<CustomerDTO> getAllCustomers();
    public CustomerDTO getCustomerById(Long id);



}
