package com.org.quick_book.services.impl;

import com.org.quick_book.entity.CountryState;
import com.org.quick_book.repository.StateRepository;
import com.org.quick_book.services.CountryStateService;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CountryStateServiceImpl implements CountryStateService {

    private final StateRepository stateRepository;

    @Override
    public List<CountryState> getAllStates() {
        List<CountryState> states = stateRepository.findAll();
        return states;
    }

    @Override
    public void addCitiesToState(String state, List<String> cities) {
        CountryState countryState = stateRepository.findByState(state).orElseThrow(
                () -> new RuntimeException("State not found")
        );
        Map<String,Object> metadata = countryState.getMetadata();
        metadata.put("cities", cities);
        stateRepository.save(countryState);
    }
}