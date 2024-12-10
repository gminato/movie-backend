package com.org.quick_book.entity;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "movies")
public class Movies {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description; 
    @Column(name = "genre")
    private List<String> genres;
    private int duration;
    private String rating;
    private String releaseDate;
    private String posterUrl;
    private String trailerUrl;

}
