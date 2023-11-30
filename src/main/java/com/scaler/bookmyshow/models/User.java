package com.scaler.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import org.springframework.aop.target.LazyInitTargetSource;

import java.util.List;

@Data
@Entity
public class User extends BaseModel{
    private String name;
    private String email;
    private  String password;
    @OneToMany
    private List<Ticket> tickets;
}
