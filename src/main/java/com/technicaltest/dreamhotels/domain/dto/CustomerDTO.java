package com.technicaltest.dreamhotels.domain.dto;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Customer DTO de Dream Hotels
 *
 * @author Simon gonzales
 * @version 2023
 */

public class CustomerDTO {
    public CustomerDTO() {
    }

    private long customerId;

    private String firstName;

    private String lastName;

    private List<ReservationDTO> reservationList;

    private LocalDateTime creationDate;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<ReservationDTO> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<ReservationDTO> reservationList) {
        this.reservationList = reservationList;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
