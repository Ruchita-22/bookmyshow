package com.scaler.bookmyshow.service;

import com.scaler.bookmyshow.archieve.dto.ShowResponseDTO;
import com.scaler.bookmyshow.archieve.dto.ShowSeatResponseDTO;
import com.scaler.bookmyshow.models.Movie;
import com.scaler.bookmyshow.models.Show;
import com.scaler.bookmyshow.models.ShowSeat;
import com.scaler.bookmyshow.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainService {
    @Autowired
    private RegionRepository regionRepository;
    @Autowired
    private ShowRepository showRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ShowSeatRepository showSeatRepository;
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> findAllMovieInTheatre(){
        List<Movie> movies = movieRepository.findAll();

        return movies;
    }

    public List<ShowResponseDTO> findAllShowOfMovie(Long movieId){
        List<Show> shows = showRepository.findAll();
        List<ShowResponseDTO> showResponseDTOS = new ArrayList<>();
        for (Show show : shows){
            Movie movie  = show.getMovie();
            if(movie.getId() == movieId){
                ShowResponseDTO showDTO = new ShowResponseDTO();
                showDTO.setShowId(show.getId());
                showDTO.setStartTime(show.getStartTime());
                showDTO.setEndTime(show.getEndTime());
                showResponseDTOS.add(showDTO);

            }
        }
        return showResponseDTOS;
    }

    public List<ShowSeatResponseDTO> findAllShowSeatOfShow(Long showId){
        List<ShowSeatResponseDTO> showSeatResponseDTOS = new ArrayList<>();

        Show show = showRepository.findById(showId).get();
        List<ShowSeat> showSeats = show.getShowSeats();

        for(ShowSeat showSeat : showSeats){
            ShowSeatResponseDTO showSeatResponseDTO = new ShowSeatResponseDTO();
            showSeatResponseDTO.setId(showSeat.getId());
            showSeatResponseDTO.setSeatNumber(showSeat.getSeat().getSeatNumber());
            showSeatResponseDTO.setShowSeatStatus(showSeat.getShowSeatStatus());
            showSeatResponseDTO.setPrice(showSeat.getPrice());
            showSeatResponseDTOS.add(showSeatResponseDTO);
        }

        return showSeatResponseDTOS;
    }

}
