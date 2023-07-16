package com.technicaltest.dreamhotels.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
/**
 * Room de Dream Hotels
 *
 * @author Simon gonzales
 * @version 2023
 */

@Entity(name = "Room")
@Table(name = "Room")
public class Room {
    public Room() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "ID_ROOM")
    private long roomId;
    @Column(name= "ROOM_NUMBER")
    private int roomNumber;
    @Column(name= "WINDOWS_NUMBER")
    private int windowsNumber;
    @Column(name= "HAS_AIR_CONDITIONING_?")
    private int hasAirConditioning;
    @ManyToOne
    @JoinColumn(name = "FK_ID_HOTEL")
    private Hotel hotel;
    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getWindowsNumber() {
        return windowsNumber;
    }

    public void setWindowsNumber(int windowsNumber) {
        this.windowsNumber = windowsNumber;
    }

    public int getHasAirConditioning() {
        return hasAirConditioning;
    }

    public void setHasAirConditioning(int hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
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
