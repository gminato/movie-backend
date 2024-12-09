package com.org.quick_book.entity;

import com.org.quick_book.annotations.MapToJsonConverter;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;


@Entity
@Table(name = "states")
@Getter
@Setter
public class CountryState {

    @Id
    private String id;
    private String state;

    @Convert(converter = MapToJsonConverter.class)
    private Map<String,Object> metadata;

    public Map<String,Object> getMetadata(){
        return metadata;
    }

    public void setMetadata(Map<String,Object> metadata){
        this.metadata = metadata;
    }
}