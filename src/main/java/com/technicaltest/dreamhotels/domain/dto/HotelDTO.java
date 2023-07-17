package com.technicaltest.dreamhotels.domain.dto;
import com.technicaltest.dreamhotels.domain.entity.Reservation;
import com.technicaltest.dreamhotels.domain.entity.Room;
import java.time.LocalDateTime;
import java.util.List;

/**
 * HotelDTO de Dream Hotels
 *
 * @author Simon gonzales
 * @version 2023
 */

public class HotelDTO {
    public HotelDTO() {
    }

    private long hotelId;

    private String name;

    private List<RoomDTO> roomList;

    private List<ReservationDTO> reservationList;

    private LocalDateTime creationDate;

    public List<ReservationDTO> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<ReservationDTO> reservationList) {
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

    public List<RoomDTO> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<RoomDTO> roomList) {
        this.roomList = roomList;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

}
