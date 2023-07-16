package com.technicaltest.dreamhotels.domain;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Hotel de Dream Hotels
 *
 * @author Simon gonzales
 * @version 2023
 */

@Entity(name = "Hotel")
public class Hotel {
    public Hotel() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "ID_HOTEL")
    private long hotelId;
    @Column(name="NAME")
    private String name;
    @Column(name= "FK_ID_ROOM_LIST")
    @OneToMany(mappedBy = "hotel")
    private List<Room> roomList;
    @Column(name= "FK_ID_RESERVATION_LIST")
    @OneToMany(mappedBy = "hotel")
    private List<Reservation> reservationList;
    @ManyToOne
    @JoinColumn(name = "FK_ID_TRAVEL_AGENCY")
    private TravelAgency travelAgency;
    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public TravelAgency getTravelAgency() {
        return travelAgency;
    }

    public void setTravelAgency(TravelAgency travelAgency) {
        this.travelAgency = travelAgency;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
