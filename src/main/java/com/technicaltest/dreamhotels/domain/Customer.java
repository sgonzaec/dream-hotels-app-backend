package com.technicaltest.dreamhotels.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "Customer")
@Table(name = "Customer")
public class Customer {
    public Customer() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "ID_CUSTOMER")
    private long customerId;
    @Column(name= "FIRST_NAME")
    private String firstName;
    @Column(name= "LAST_NAME")
    private String lastName;
    @Column(name= "FK_ID_RESERVATION_LIST")
    @OneToMany(mappedBy = "Customer")
    private List<Reservation> reservationList;
    @Column(name = "CREATION_DATE")
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

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
