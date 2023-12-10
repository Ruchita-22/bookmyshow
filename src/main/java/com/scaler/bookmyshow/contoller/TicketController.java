package com.scaler.bookmyshow.contoller;

import com.scaler.bookmyshow.dto.TicketResponseDTO;
import com.scaler.bookmyshow.exception.ShowSeatNotAvailableException;
import com.scaler.bookmyshow.models.*;
import com.scaler.bookmyshow.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TicketController {
    @Autowired
    InitService1 initService1;
    @Autowired
    TicketService ticketService;

    @GetMapping(value = "init")
    public ResponseEntity getInit(){
        Region region = initService1.createObject();
        User user = initService1.createUser("Ruchita", "ruchita22@gmail.com","admin@1234");
        return  ResponseEntity.ok(region);
    }

    @GetMapping(value = "region/{regionId}/theatre/{theatreId}/movie/{movieId}/show/{showId}/showseat/{showSeatId}/book")
    //region/1/theatre/1/movie/1/show/1/showseat
    public TicketResponseDTO bookTicket(@PathVariable("showId") Long showId, @PathVariable("showSeatId") Long showSeatId) throws ShowSeatNotAvailableException {
        List<Long> showseat = new ArrayList<>();
        showseat.add(showSeatId);
        long userID = 1L;
        TicketResponseDTO ticketResponseDTO = null;
        try {
            ticketResponseDTO = ticketService.bookTicket(userID,showId, showseat);
        }catch (ShowSeatNotAvailableException showSeatNotAvailableException){
            System.out.println("ShowSeatNotAvailableException : "+ showSeatNotAvailableException);
        }

        return ticketResponseDTO;

    }


}
