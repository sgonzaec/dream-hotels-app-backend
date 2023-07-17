package com.technicaltest.dreamhotels.domain.dto;


import java.time.LocalDateTime;

/**
 * Reservation DTO de Dream Hotels
 *
 * @author Simon gonzales
 * @version 2023
 */

public class ReservationDTO {
    public ReservationDTO() {
    }


    private long reservationId;

    private int totalDays;

    private Long roomId;

    private Long travelAgencyId;

    private Long hotelId;

    private Long customerId;

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

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getTravelAgencyId() {
        return travelAgencyId;
    }

    public void setTravelAgencyId(Long travelAgencyId) {
        this.travelAgencyId = travelAgencyId;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
