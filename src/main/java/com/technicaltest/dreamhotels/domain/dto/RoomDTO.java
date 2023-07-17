package com.technicaltest.dreamhotels.domain.dto;


import java.time.LocalDateTime;

/**
 * Room DTO de Dream Hotels
 *
 * @author Simon gonzales
 * @version 2023
 */

public class RoomDTO {
    public RoomDTO() {
    }


    private long roomId;

    private int roomNumber;

    private int windowsNumber;

    private int hasAirConditioning;

    private Long hotelId;

    private LocalDateTime creationDate;

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

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

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
