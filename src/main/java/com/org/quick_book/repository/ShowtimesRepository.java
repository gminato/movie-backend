package com.org.quick_book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.quick_book.entity.Showtimes;

public interface ShowtimesRepository extends JpaRepository<Showtimes, Integer> {
    
}
