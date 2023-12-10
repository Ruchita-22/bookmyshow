package com.scaler.bookmyshow.service;

import com.scaler.bookmyshow.dto.TicketResponseDTO;
import com.scaler.bookmyshow.exception.ShowSeatNotAvailableException;
import com.scaler.bookmyshow.mapper.TicketMapper;
import com.scaler.bookmyshow.models.Show;
import com.scaler.bookmyshow.models.ShowSeat;
import com.scaler.bookmyshow.models.Ticket;
import com.scaler.bookmyshow.models.User;
import com.scaler.bookmyshow.models.enums.BookingStatus;
import com.scaler.bookmyshow.models.enums.ShowSeatStatus;
import com.scaler.bookmyshow.repository.ShowRepository;
import com.scaler.bookmyshow.repository.ShowSeatRepository;
import com.scaler.bookmyshow.repository.TicketRepository;
import com.scaler.bookmyshow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {
    @Autowired
    TicketRepository ticketRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ShowRepository showRepository;
    @Autowired
    ShowSeatRepository showSeatRepository;
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public TicketResponseDTO bookTicket(Long userId, Long showId, List<Long> showSeatIds) throws ShowSeatNotAvailableException {
        User user = userRepository.findById(userId).get();
        Show show = showRepository.findById(showId).get();
        for (Long showSeatId : showSeatIds){
            ShowSeat showSeat = showSeatRepository.findById(showSeatId).get();
            if(showSeat.getShowSeatStatus().equals(ShowSeatStatus.AVAILABALE)){
                showSeat.setShowSeatStatus(ShowSeatStatus.LOCKED);
            }
            else{
                // exception
                throw new ShowSeatNotAvailableException("Show seat is not available");
            }
            showSeatRepository.save(showSeat);
        }
        boolean paymentDone = paymentCheck();
        List<ShowSeat> showSeats = new ArrayList<>();
        double amount = 0;
        if(paymentDone){
            for (Long showSeatId : showSeatIds){
                ShowSeat showSeat = showSeatRepository.findById(showSeatId).get();
                showSeat.setShowSeatStatus(ShowSeatStatus.BOOKED);
                showSeat = showSeatRepository.save(showSeat);
                showSeats.add(showSeat);
                amount += showSeat.getPrice();
            }
        }
        Ticket ticket = generateTicket(user,show,showSeats,amount);

        TicketResponseDTO ticketResponseDTO = TicketMapper.ticketToTicketResponseDTO(ticket);
        return ticketResponseDTO;
    }

    private boolean paymentCheck() {
        return true;
    }

    public Ticket generateTicket(User user, Show show, List<ShowSeat> showSeats, double amount){
        Ticket ticket = new Ticket();
        ticket.setUser(user);
        ticket.setShow(show);
        ticket.setShowSeats(showSeats);
        ticket.setAmount(amount);
        ticket.setBookingStatus(BookingStatus.CONFIRMED);
        ticket.setBookedAt(LocalDateTime.now());
        return ticketRepository.save(ticket);
    }
}
