package com.org.quick_book.repository;

import com.org.quick_book.entity.CountryState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StateRepository extends JpaRepository<CountryState, String> {
    Optional<CountryState> findByState(String state);
}
