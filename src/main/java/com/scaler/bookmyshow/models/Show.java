package com.scaler.bookmyshow.models;

import com.scaler.bookmyshow.models.enums.Feature;
import jakarta.persistence.*;
import lombok.Data;


import java.util.Date;
import java.util.List;

@Data
@Entity
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;

    private Date startTime;
    private Date endTime;

    @ManyToOne
    private Screen screen;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;

    @OneToMany
    @JoinColumn(name = "show_id")
    private List<ShowSeat> showSeats;
}
