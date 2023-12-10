package com.scaler.bookmyshow.mapper;

import com.scaler.bookmyshow.dto.TicketResponseDTO;
import com.scaler.bookmyshow.models.ShowSeat;
import com.scaler.bookmyshow.models.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketMapper {
    public static TicketResponseDTO ticketToTicketResponseDTO(Ticket ticket){
        TicketResponseDTO ticketResponseDTO = new TicketResponseDTO();

        ticketResponseDTO.setUserId(ticket.getUser().getId());
        ticketResponseDTO.setShowId(ticket.getShow().getId());
        ticketResponseDTO.setScreenId(ticket.getShow().getScreen().getId());

        List<Long> showSeatIds = new ArrayList<>();
        for(ShowSeat showSeat : ticket.getShowSeats()){
            showSeatIds.add(showSeat.getId());
        }
        ticketResponseDTO.setShowSeatIds(showSeatIds);
        ticketResponseDTO.setAmount(ticket.getAmount());
        ticketResponseDTO.setBookingStatus(ticket.getBookingStatus());
        ticketResponseDTO.setBookedAt(ticket.getBookedAt());
        ticketResponseDTO.setPayments(ticket.getPayments());
        return ticketResponseDTO;
    }
}
