package com.scaler.bookmyshow.models;

import com.scaler.bookmyshow.models.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;


@Data
@Entity
public class Ticket extends BaseModel{
    @ManyToOne
    private User user;
    @ManyToOne
    private Show show;
    @ManyToMany
    private List<ShowSeat> showSeats;
    private double amount;
    @OneToMany
    private List<Payment> payments; // let the mapping table got created
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;
    private LocalDateTime bookedAt;

}
