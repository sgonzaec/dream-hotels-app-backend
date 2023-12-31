package com.technicaltest.dreamhotels.domain.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Travel Agency de Dream Hotels
 *
 * @author Simon gonzales
 * @version 2023
 */
@Entity(name = "TravelAgency")
public class TravelAgency {
    public TravelAgency() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID_TRAVEL_AGENCY")
    private long travelAgencyId;
    @Column(name= "NAME")
    private String name;
    @Column(name= "NIT")
    private int nit;
    @ManyToMany(mappedBy = "travelAgency") // mappedBy indica que la entidad Hotel tiene el control de la relación
    private List<Hotel> hotelList;
    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;
    @Column(name= "FK_ID_RESERVATION_LIST")
    @OneToMany(mappedBy = "travelAgency")
    private List<Reservation> reservationList;

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

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

    public List<Hotel> getHotelList() {
        return hotelList;
    }

    public void setHotelList(List<Hotel> hotelList) {
        this.hotelList = hotelList;
    }
}
