package com.scaler.bookmyshow.contoller;

import com.scaler.bookmyshow.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    TicketService ticketService;
    @GetMapping("ticket")
    public ResponseEntity getTicket(){

        return ResponseEntity.ok("hello");
    }
}
