package com.scaler.bookmyshow.service;

import com.scaler.bookmyshow.models.Movie;
import com.scaler.bookmyshow.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    TheatreService theatreService;
    @Autowired
    MovieRepository movieRepository;

    public void saveMovie(Movie movie) {
        movieRepository.save(movie);

    }
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }
    public Movie findById(Long movieId) {
        return movieRepository.findById(movieId).get();
    }
}
