package com.scaler.bookmyshow.contoller;

import com.scaler.bookmyshow.models.*;
import com.scaler.bookmyshow.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketController {

    @Autowired
    InitService initService;

    @GetMapping(value = "init")
    public ResponseEntity getInit(){
        initService.createObject();
        User user = initService.createUser("Ruchita", "ruchita22@gmail.com","admin@1234");

        return ResponseEntity.ok("done");
    }

    @GetMapping(value = "region")
    public ResponseEntity findAllRegion(){
        List<Region> regions = initService.findAllRegion();
        return ResponseEntity.ok(regions);
    }
    @GetMapping(value = "region/theatre")
    public ResponseEntity findAllTheatreInRegion(){
        List<String> theatres = initService.findAllTheatreInRegion();
        return ResponseEntity.ok(theatres);
    }
    @GetMapping(value = "region/theatre/movie")
    public ResponseEntity findAllMovieInTheatre(){
        List<Movie> movies = initService.findAllMovieInTheatre();
        return ResponseEntity.ok(movies);
    }
    @GetMapping(value = "region/theatre/movie/show")
    public ResponseEntity findAllOfMovieShow(){
        List<Show> shows = initService.findAllOfMovieShow();
        return ResponseEntity.ok(shows);
    }

    @GetMapping(value = "region/theatre/movie/show/seat")
    public ResponseEntity findAllShowSeatOfMovie(){
        List<ShowSeat> showSeats = initService.findAllShowSeatOfMovie();
        return ResponseEntity.ok(showSeats);
    }




}
