package com.org.quick_book.controller;

import com.org.quick_book.entity.CountryState;
import com.org.quick_book.services.CountryStateService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/state")
public class StateController {

    @Autowired
    private CountryStateService countryStateService;


    @GetMapping("/all")
    public ResponseEntity<List<CountryState>> getAllStates() {
        return ResponseEntity.ok(countryStateService.getAllStates());
    }

    @PostMapping("/addCities")
    public ResponseEntity<Object> addCitiesToState(
            @RequestParam(name = "state") String state,
            @RequestParam(name = "cities") List<String> cities
    ) {
        countryStateService.addCitiesToState(state, cities);
        return ResponseEntity.ok().build();
    }

}
