package com.org.quick_book.entity;
// id INT PRIMARY KEY,
//     movie_id INT REFERENCES movies(id) ON DELETE CASCADE,
//     screen_id INT REFERENCES screens(id) ON DELETE CASCADE,
//     time TIMESTAMP NOT NULL,
//     price DECIMAL(10, 2) NOT NULL,
//     currency VARCHAR(10) NOT NULL,
//     available_seats INT

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Showtimes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int movieId;
    private int screenId;
    private String time;
    private double price;
    private String currency;
    private int availableSeats;
    
}
