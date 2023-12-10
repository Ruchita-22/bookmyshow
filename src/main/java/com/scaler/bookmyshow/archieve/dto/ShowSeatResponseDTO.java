package com.scaler.bookmyshow.archieve.dto;

import com.scaler.bookmyshow.models.enums.ShowSeatStatus;
import lombok.Data;

@Data
public class ShowSeatResponseDTO {
    private Long id;
    private String seatNumber;
    private ShowSeatStatus showSeatStatus;
    private double price;

}
