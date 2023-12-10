package com.scaler.bookmyshow.mapper;

import com.scaler.bookmyshow.dto.ShowSeatResponseDTO;
import com.scaler.bookmyshow.models.ShowSeat;

public class ShowSeatMapper {
    public static ShowSeatResponseDTO showSeatToShowSeatResponseDTO(ShowSeat showSeat){
        ShowSeatResponseDTO showSeatResponseDTO = new ShowSeatResponseDTO();
        showSeatResponseDTO.setId(showSeat.getId());
        showSeatResponseDTO.setSeatNumber(showSeat.getSeat().getSeatNumber());
        showSeatResponseDTO.setShowSeatStatus(showSeat.getShowSeatStatus());
        showSeatResponseDTO.setPrice(showSeat.getPrice());
        return showSeatResponseDTO;
    }

}
