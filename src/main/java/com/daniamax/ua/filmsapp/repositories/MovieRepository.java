package com.daniamax.ua.filmsapp.repositories;

import com.daniamax.ua.filmsapp.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findTop5ByOrderById();
}
