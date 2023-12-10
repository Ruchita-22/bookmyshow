package com.scaler.bookmyshow.models;

import com.scaler.bookmyshow.models.enums.Feature;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Screen extends BaseModel{      //Audi1, Audi2
    private String name;

    @Enumerated(EnumType.STRING)
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "screen_id")
    private List<Seat> seats;

}
