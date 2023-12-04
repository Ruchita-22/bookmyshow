package com.scaler.bookmyshow.repository;

import com.scaler.bookmyshow.models.Screen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScreenRepository extends JpaRepository<Screen,Long> {

}
