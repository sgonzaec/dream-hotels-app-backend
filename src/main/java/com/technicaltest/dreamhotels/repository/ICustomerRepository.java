package com.technicaltest.dreamhotels.repository;

import com.technicaltest.dreamhotels.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository <Customer, Long> {

}
