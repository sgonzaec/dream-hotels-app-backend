package com.technicaltest.dreamhotels.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "TravelAgency")
@Table(name = "TravelAgency")
public class TravelAgency {
    public TravelAgency() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "ID_TRAVEL_AGENCY")
    private long travelAgencyId;
    @Column(name= "NAME")
    private int name;
    @Column(name= "NIT")
    private int nit;
    @OneToMany(mappedBy = "TravelAgency")
    @Column(name= "FK_ID_HOTEL_LIST")
    private List<Hotel> hotelList;
    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;

    public long getTravelAgencyId() {
        return travelAgencyId;
    }

    public void setTravelAgencyId(long travelAgencyId) {
        this.travelAgencyId = travelAgencyId;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public List<Hotel> getHotelList() {
        return hotelList;
    }

    public void setHotelList(List<Hotel> hotelList) {
        this.hotelList = hotelList;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
