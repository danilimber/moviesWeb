package com.daniamax.ua.filmsapp.controllers;

import com.daniamax.ua.filmsapp.models.Movie;
import com.daniamax.ua.filmsapp.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MainRESTController {

    private final MovieRepository movieRepository;

    @Autowired
    public MainRESTController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @GetMapping("/movies/{id}")
    public Optional<Movie> getMovie(@PathVariable Long id) {
        return movieRepository.findById(id);
    }

    @GetMapping("/movies/top5")
    public List<Movie> getTop5Movie() {
        return movieRepository.findTop5ByOrderById();
    }
}
