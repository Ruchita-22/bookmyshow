package com.scaler.bookmyshow.contoller;

import com.scaler.bookmyshow.dto.RegionResponseDTO;
import com.scaler.bookmyshow.dto.TheatreResponseDTO;
import com.scaler.bookmyshow.models.Region;
import com.scaler.bookmyshow.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegionController {
    @Autowired
    RegionService regionService;

    @PostMapping("region")
    public void addRegion(@RequestBody Region region){
        regionService.saveRegion(region);
    }
    @GetMapping("region")
    public List<RegionResponseDTO> findAllRegion() {
        return regionService.findAllRegion();
    }
    @GetMapping("region/{regionId}")
    public RegionResponseDTO findRegionById(@PathVariable("regionId") Long regionId) {
        return regionService.findRegionById(regionId);
    }

    @GetMapping("region/{regionId}/theatre")
    public List<TheatreResponseDTO> findAllTheatreInRegion(@PathVariable("regionId") Long regionId){
        return regionService.findAllTheatreInRegion(regionId);
    }
}
