package com.scaler.bookmyshow.models;

import com.scaler.bookmyshow.models.enums.ShowSeatStatus;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ShowSeat extends BaseModel{    // 11am, F14 Booked
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    private double price;
    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;
}
