package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class Theatre extends BaseModel{     //PVR
    private String name;
    @ManyToOne
    private Region region;
    @OneToMany
    @JoinColumn(name = "screen_id")
    private List<Screen> screens;
}
