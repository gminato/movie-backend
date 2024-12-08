package com.org.quick_book.services.impl;

import com.org.quick_book.entity.CountryState;
import com.org.quick_book.repository.StateRepository;
import com.org.quick_book.services.CountryStateService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class CountryStateServiceImpl implements CountryStateService {

    @Autowired
    private StateRepository stateRepository;


    @Override
    public List<CountryState> getAllStates() {
        List<CountryState> states = stateRepository.findAll();
        return states;
    }
}
