package com.technicaltest.dreamhotels.controller;


import com.technicaltest.dreamhotels.domain.dto.CustomerDTO;
import com.technicaltest.dreamhotels.domain.entity.Customer;

import com.technicaltest.dreamhotels.service.interfaces.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/customer")
public class CustomerController {

    private final ICustomerService iCustomerService;

    @Autowired
    public CustomerController(ICustomerService customerService) {
        this.iCustomerService = customerService;
    }

    @GetMapping("/{id}")
    public CustomerDTO getCustomerById(@PathVariable Long id) {
        return iCustomerService.getCustomerById(id);
    }

    @GetMapping("")
    public List<CustomerDTO> getAllCustomers() {
        return iCustomerService.getAllCustomers();
    }
    @PostMapping
    public CustomerDTO postCustomer(@RequestBody CustomerDTO customerDTO) {
        return iCustomerService.insertCustomer(customerDTO);
    }
    @PutMapping
    public CustomerDTO putCustomer(@RequestBody CustomerDTO customerDTO) {
        return iCustomerService.updateCustomer(customerDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        iCustomerService.deleteCustomerById(id);
    }
}
