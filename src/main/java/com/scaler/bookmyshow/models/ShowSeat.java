package com.scaler.bookmyshow.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.scaler.bookmyshow.models.enums.ShowSeatStatus;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ShowSeat extends BaseModel{    // 11am, F14 Booked

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bms_show_id")
    @JsonBackReference
    private Show show;

    @ManyToOne(cascade = CascadeType.ALL)
    private Seat seat;

    private double price;

    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;
}
