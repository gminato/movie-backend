package com.org.quick_book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.quick_book.entity.Theatres;

public interface TheatresRepository extends JpaRepository<Theatres, Integer> {
    
}
