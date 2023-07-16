package com.technicaltest.dreamhotels.service;

import com.technicaltest.dreamhotels.domain.Customer;

import java.util.List;

public interface ICustomerService {
    public Customer insertCustomer(Customer customer);
    public void deleteCustomerById(Long id);
    public Customer updateCustomer(Customer customer);
    public List<Customer> getAllCustomers();
    public Customer getCustomerById(Long id);



}
