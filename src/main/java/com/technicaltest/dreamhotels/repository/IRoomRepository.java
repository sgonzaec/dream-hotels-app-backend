package com.technicaltest.dreamhotels.repository;

import com.technicaltest.dreamhotels.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoomRepository extends JpaRepository <Room, Long> {

}
