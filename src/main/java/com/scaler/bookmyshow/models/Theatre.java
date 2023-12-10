package com.scaler.bookmyshow.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class Theatre extends BaseModel{     //PVR
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "region_id")         // region id will go in theatre table
    @JsonBackReference
    private Region region;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "theatre_id")        // theatre_id will go in screen table
    private List<Screen> screens;
}


