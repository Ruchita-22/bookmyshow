package com.scaler.bookmyshow.service;

import com.scaler.bookmyshow.archieve.dto.TheatreResponseDTO;
import com.scaler.bookmyshow.models.Theatre;
import com.scaler.bookmyshow.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheatreService {
    @Autowired
    TheatreRepository theatreRepository;

    public void saveTheatre(@RequestBody Theatre theatre){
        theatreRepository.save(theatre);
    }

    public List<TheatreResponseDTO> findAll() {
        List<TheatreResponseDTO> theatreResponseDTOS = new ArrayList<>();

        List<Theatre> theatres = theatreRepository.findAll();
        for (Theatre theatre : theatres){
            TheatreResponseDTO theatreResponseDTO = new TheatreResponseDTO();
            theatreResponseDTO.setId(theatre.getId());
            theatreResponseDTO.setName(theatre.getName());
            theatreResponseDTOS.add(theatreResponseDTO);
        }
        return theatreResponseDTOS;
    }

    public TheatreResponseDTO findById(Long theatreId) {
        Theatre theatre =  theatreRepository.findById(theatreId).get();
        TheatreResponseDTO theatreResponseDTO = new TheatreResponseDTO();
        theatreResponseDTO.setId(theatre.getId());
        theatreResponseDTO.setName(theatre.getName());
        return theatreResponseDTO;
    }


}
