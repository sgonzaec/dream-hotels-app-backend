package com.technicaltest.dreamhotels.controller;


import com.technicaltest.dreamhotels.domain.Customer;
import com.technicaltest.dreamhotels.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired(required=true)
    private ICustomerService iCustomerService;
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return iCustomerService.getCustomerById(id);
    }

    @GetMapping("")
    public List<Customer> getAllCustomers() {
        return iCustomerService.getAllCustomers();
    }
    @PostMapping
    public Customer postCustomer(@RequestBody Customer customer) {
        return iCustomerService.insertCustomer(customer);
    }
    @PutMapping
    public Customer putCustomer(@RequestBody Customer customer) {
        return iCustomerService.updateCustomer(customer);
    }
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        iCustomerService.deleteCustomerById(id);
    }
}
