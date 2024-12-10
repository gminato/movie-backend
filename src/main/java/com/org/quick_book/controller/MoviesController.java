package com.org.quick_book.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.quick_book.entity.Movies;
import com.org.quick_book.services.MovieService;

import lombok.RequiredArgsConstructor;

@RestController
@Controller
@RequestMapping("api/movies")
@RequiredArgsConstructor
public class MoviesController {

    private final MovieService movieService;

    @GetMapping("/all")
    public ResponseEntity<List<Movies>> getAllMovies() {
        return ResponseEntity.ok(movieService.getAllMovies());
    }
    
}
