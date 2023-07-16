package com.technicaltest.dreamhotels.repository;

import com.technicaltest.dreamhotels.domain.TravelAgency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITravelAgencyRepository extends JpaRepository <TravelAgency, Long> {

}
