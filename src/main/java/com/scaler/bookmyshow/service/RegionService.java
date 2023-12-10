package com.scaler.bookmyshow.service;

import com.scaler.bookmyshow.dto.RegionResponseDTO;
import com.scaler.bookmyshow.dto.TheatreResponseDTO;
import com.scaler.bookmyshow.models.Region;
import com.scaler.bookmyshow.models.Theatre;
import com.scaler.bookmyshow.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegionService {
    @Autowired
    RegionRepository regionRepository;

    public void saveRegion(Region region){
        regionRepository.save(region);
    }

    public List<RegionResponseDTO> findAllRegion() {
        List<RegionResponseDTO> regionResponseDTOS = new ArrayList<>();
        List<Region> regions = regionRepository.findAll();
        for(Region region :  regions){
            RegionResponseDTO regionResponseDTO = new RegionResponseDTO();
            regionResponseDTO.setId(region.getId());
            regionResponseDTO.setName(region.getName());
            regionResponseDTOS.add(regionResponseDTO);
        }
        return regionResponseDTOS;
    }

    public RegionResponseDTO findRegionById(Long regionId) {
        Region  region = regionRepository.findById(regionId).get();

        RegionResponseDTO regionResponseDTO = new RegionResponseDTO();
        regionResponseDTO.setId(region.getId());
        regionResponseDTO.setName(region.getName());

        return regionResponseDTO;
    }

    public List<TheatreResponseDTO> findAllTheatreInRegion(Long regionId) throws InvalidDataAccessApiUsageException {
        Region region = regionRepository.findById(regionId).get();
        List<Theatre> theatres = region.getTheatres();
        List<TheatreResponseDTO> theatreResponseDTOS = new ArrayList<>();
        for(Theatre theatre :  theatres){
            TheatreResponseDTO theatreResponseDTO = new TheatreResponseDTO();
            theatreResponseDTO.setId(theatre.getId());
            theatreResponseDTO.setName(theatre.getName());
            theatreResponseDTOS.add(theatreResponseDTO);
        }
        return theatreResponseDTOS;
    }
}
