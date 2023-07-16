package com.technicaltest.dreamhotels.repository;

import com.technicaltest.dreamhotels.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IReservationRepository extends JpaRepository <Reservation, Long> {

}
