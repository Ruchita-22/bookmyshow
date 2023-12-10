package com.scaler.bookmyshow.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Seat extends BaseModel{
    private int rowVal;
    private int colVal;
    private String seatNumber;

    @ManyToOne(cascade = CascadeType.ALL)
    private SeatType seatType;
}
