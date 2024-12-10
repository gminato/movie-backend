package com.org.quick_book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.org.quick_book.entity.Movies;

@Repository
public interface MovieRepository  extends JpaRepository<Movies, Long> {

    
} 