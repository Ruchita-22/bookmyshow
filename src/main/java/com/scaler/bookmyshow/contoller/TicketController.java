package com.scaler.bookmyshow.contoller;

import com.scaler.bookmyshow.models.Region;
import com.scaler.bookmyshow.models.User;
import com.scaler.bookmyshow.service.RegionService;
import com.scaler.bookmyshow.service.TicketService;
import com.scaler.bookmyshow.service.UserService;
import com.scaler.bookmyshow.util.DummyObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    TicketService ticketService;
    @Autowired
    RegionService regionService;
    @Autowired
    UserService userService;
    @GetMapping("ticket")
    public ResponseEntity getTicket(){
        return ResponseEntity.ok("hello");
    }
    @GetMapping("region")
    public ResponseEntity getRegion(){
        DummyObject dummyObject = new DummyObject();
        Region region = dummyObject.createObject();

        User user = dummyObject.createUser("Ruchita", "ruchita22@gmail.com", "admin@1234");
        regionService.addRegion(region);
        userService.addUser(user);

        return ResponseEntity.ok(region);
    }
}
