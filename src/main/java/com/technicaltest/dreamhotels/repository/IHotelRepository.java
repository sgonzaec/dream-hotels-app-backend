package com.technicaltest.dreamhotels.repository;

import com.technicaltest.dreamhotels.domain.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHotelRepository extends JpaRepository <Hotel, Long> {

}
