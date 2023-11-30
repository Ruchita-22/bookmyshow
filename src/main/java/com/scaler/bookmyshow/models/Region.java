package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class Region extends BaseModel{      // Greater Noida
    private String name;
    @OneToMany
    @JoinColumn(name = "theatre_id")
    private List<Theatre> theatres;

}
