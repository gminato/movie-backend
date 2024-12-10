package com.org.quick_book.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.org.quick_book.entity.Movies;
import com.org.quick_book.repository.MovieRepository;
import com.org.quick_book.services.MovieService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MoviesImplementation implements MovieService {

    private final MovieRepository movieRepository;

    @Override
    public List<Movies> getAllMovies() {
        List<Movies> movies = movieRepository.findAll();
        return movies;
    }
    
}
