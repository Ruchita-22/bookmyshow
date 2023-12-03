package com.scaler.bookmyshow.service;

import com.scaler.bookmyshow.models.Region;
import com.scaler.bookmyshow.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {
    @Autowired
    RegionRepository regionRepository;
    public void addRegion(Region region){
        regionRepository.save(region);
    }
    public Region findRegionById(Long id){
        return regionRepository.findById(id).get();
    }
    public List<Region> findAllRegion(Long id){
        return regionRepository.findAll();
    }

}
