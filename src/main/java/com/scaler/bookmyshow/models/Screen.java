package com.scaler.bookmyshow.models;

import com.scaler.bookmyshow.models.enums.Feature;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Screen extends BaseModel{      //Audi1, Audi2
    private String name;
    @Enumerated(EnumType.ORDINAL)
    private List<Feature> features;
    @OneToMany
    @JoinColumn(name = "seat_id")
    private List<Seat> seats;

}
