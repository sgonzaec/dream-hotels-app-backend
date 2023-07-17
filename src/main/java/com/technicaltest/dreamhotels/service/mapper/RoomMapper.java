package com.technicaltest.dreamhotels.service.mapper;
import com.technicaltest.dreamhotels.domain.dto.RoomDTO;
import com.technicaltest.dreamhotels.domain.entity.Room;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RoomMapper
{
    private final ModelMapper modelMapper;
    public RoomMapper() {
        this.modelMapper = new ModelMapper();
    }

    public RoomDTO convertToDTO(Room room) {
        return modelMapper.map(room, RoomDTO.class);
    }

    public Room convertToEntity(RoomDTO roomDTO) {
        return modelMapper.map(roomDTO, Room.class);
    }
}
