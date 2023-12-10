package com.scaler.bookmyshow.archieve.dto;

import com.scaler.bookmyshow.models.Payment;
import com.scaler.bookmyshow.models.ShowSeat;
import com.scaler.bookmyshow.models.enums.BookingStatus;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class TicketResponseDTO {
    private Long userId;

    private Long showId;
    private List<Long> showSeatIds;
    private double amount;
    private List<Payment> payments;
    private BookingStatus bookingStatus;
    private LocalDateTime bookedAt;
}
