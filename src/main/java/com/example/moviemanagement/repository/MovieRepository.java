package com.example.moviemanagement.repository;

import com.example.moviemanagement.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class MovieRepository {

    private final List<Movie> movies = new ArrayList<>();
    private Long nextId = 1L;

    public List<Movie> findAll() {
        return new ArrayList<>(movies);
    }

    public Optional<Movie> findById(Long id) {
        return movies.stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst();
    }

    public Movie save(Movie movie) {
        movie.setId(nextId++);
        movies.add(movie);
        return movie;
    }
}
