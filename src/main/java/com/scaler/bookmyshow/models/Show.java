package com.scaler.bookmyshow.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.scaler.bookmyshow.models.enums.Feature;
import jakarta.persistence.*;
import lombok.Data;


import java.util.Date;
import java.util.List;

@Data
@Entity(name = "bms_show")
public class Show extends BaseModel{
    @ManyToOne(cascade = CascadeType.ALL)
    private Movie movie;

    private Date startTime;
    private Date endTime;

    @ManyToOne(cascade = CascadeType.ALL)           // where we define ManyToOne it will show screen id in show table
    private Screen screen;

    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<Feature> features;

    @OneToMany(mappedBy = "show",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<ShowSeat> showSeats;
}
