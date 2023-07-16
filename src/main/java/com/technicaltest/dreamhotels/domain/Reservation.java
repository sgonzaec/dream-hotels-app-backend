package com.technicaltest.dreamhotels.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
@Table(name = "Reservation")
@Entity(name = "Reservation")
public class Reservation {
    public Reservation() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "ID_RESERVATION")
    private long reservationId;
    @Column(name="TOTAL_DAYS")
    private int totalDays;
    @ManyToOne
    @JoinColumn(name = "FK_ID_CUSTOMER")
    private Customer customer;
    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Room room;
    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private TravelAgency travelAgency;
    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Hotel hotel;
    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;

    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public TravelAgency getTravelAgency() {
        return travelAgency;
    }

    public void setTravelAgency(TravelAgency travelAgency) {
        this.travelAgency = travelAgency;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}