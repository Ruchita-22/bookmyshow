package com.scaler.bookmyshow.contoller;

import com.scaler.bookmyshow.models.Movie;
import com.scaler.bookmyshow.models.Theatre;
import com.scaler.bookmyshow.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("movie")
    public void addMovie(@RequestBody Movie movie){
        movieService.saveMovie(movie);
    }
    @GetMapping("movie")
    public List<Movie> findAll() {
        return movieService.findAll();
    }

    @GetMapping("region/{regionId}/theatre/{theatreId}/movie")
    public List<Movie> findAllMovie() {
        return movieService.findAll();
    }

    @GetMapping("region/{regionId}/theatre/{theatreId}/movie/{movieId}")
    public Movie findById(@PathVariable("movieId") Long movieId) {
        return movieService.findById(movieId);
    }
}
