package com.scaler.bookmyshow.contoller;

import com.scaler.bookmyshow.archieve.dto.ShowResponseDTO;
import com.scaler.bookmyshow.archieve.dto.ShowSeatResponseDTO;
import com.scaler.bookmyshow.archieve.dto.TicketResponseDTO;
import com.scaler.bookmyshow.exception.ShowSeatNotAvailableException;
import com.scaler.bookmyshow.models.Ticket;
import com.scaler.bookmyshow.service.MainService;
import com.scaler.bookmyshow.service.TicketService;
import com.scaler.bookmyshow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {
    @Autowired
    MainService mainService;


    @GetMapping("region/{regionId}/theatre/{theatreId}/movie/{movieId}/show")
    //region/1/theatre/1/movie/1/show
    public List<ShowResponseDTO> findAllShowOfMovie(@PathVariable("movieId") Long movieId ){
        List<ShowResponseDTO> showResponseDTOS = mainService.findAllShowOfMovie(movieId);
        return showResponseDTOS;
    }

    @GetMapping(value = "region/{regionId}/theatre/{theatreId}/movie/{movieId}/show/{showId}/showseat")
    //region/1/theatre/1/movie/1/show/1/showseat
    public List<ShowSeatResponseDTO> findAllShowSeatOfShow(@PathVariable("showId") Long showId){
        List<ShowSeatResponseDTO> showSeatResponseDTOS  = mainService.findAllShowSeatOfShow(showId);
        return showSeatResponseDTOS;
    }


}
