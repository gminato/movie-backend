package com.org.quick_book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.quick_book.entity.Screens;

@Repository
public interface ScreensRepository extends JpaRepository<Screens, Integer> {
    
}
