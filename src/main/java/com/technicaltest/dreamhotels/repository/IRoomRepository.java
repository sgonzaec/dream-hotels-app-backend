package com.technicaltest.dreamhotels.repository;

import com.technicaltest.dreamhotels.domain.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoomRepository extends JpaRepository <Room, Long> {

}
