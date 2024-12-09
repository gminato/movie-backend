package com.org.quick_book.services.impl;

import com.org.quick_book.entity.CountryState;
import com.org.quick_book.repository.StateRepository;
import com.org.quick_book.services.CountryStateService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CountryStateServiceImpl implements CountryStateService {

    @Autowired
    private StateRepository stateRepository;

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