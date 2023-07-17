package com.technicaltest.dreamhotels.domain.entity;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @ManyToMany
    @JoinTable(
            name = "HotelXtravelAgency", // Nombre de la tabla intermedia
            joinColumns = @JoinColumn(name = "FK_ID_HOTEL"), // Nombre de la columna que contiene la clave foránea de Estudiante
            inverseJoinColumns = @JoinColumn(name = "FK_ID_TRAVEL_AGENCY") // Nombre de la columna que contiene la clave foránea de Curso
    )
    private List<TravelAgency> travelAgency;
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

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public List<TravelAgency> getTravelAgency() {
        return travelAgency;
    }

    public void setTravelAgency(List<TravelAgency> travelAgency) {
        this.travelAgency = travelAgency;
    }
}
