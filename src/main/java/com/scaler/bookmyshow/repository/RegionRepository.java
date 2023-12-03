package com.scaler.bookmyshow.repository;


import com.scaler.bookmyshow.models.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {
}
