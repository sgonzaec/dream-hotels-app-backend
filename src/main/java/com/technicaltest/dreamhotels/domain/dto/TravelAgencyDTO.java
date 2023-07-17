package com.technicaltest.dreamhotels.domain.dto;

import com.technicaltest.dreamhotels.domain.entity.Reservation;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Travel Agency DTO de Dream Hotels
 *
 * @author Simon gonzales
 * @version 2023
 */
public class TravelAgencyDTO {
    public TravelAgencyDTO() {
    }

    private long travelAgencyId;

    private String name;

    private int nit;

    private List<HotelDTO> hotelList;

    private LocalDateTime creationDate;


    public long getTravelAgencyId() {
        return travelAgencyId;
    }

    public void setTravelAgencyId(long travelAgencyId) {
        this.travelAgencyId = travelAgencyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public List<HotelDTO> getHotelList() {
        return hotelList;
    }

    public void setHotelList(List<HotelDTO> hotelList) {
        this.hotelList = hotelList;
    }
}
