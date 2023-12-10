package com.scaler.bookmyshow.contoller;

import com.scaler.bookmyshow.archieve.dto.TheatreResponseDTO;
import com.scaler.bookmyshow.models.Theatre;
import com.scaler.bookmyshow.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class TheatreController {
    @Autowired
    TheatreService theatreService;

    @PostMapping("theatre")
    public void addTheatre(@RequestBody Theatre theatre){
        theatreService.saveTheatre(theatre);
    }
    @GetMapping("theatre")
    public List<TheatreResponseDTO> findAll() {
        return theatreService.findAll();
    }
    @GetMapping("theatre/{theatreId}")
    public TheatreResponseDTO findById(@PathVariable("theatreId") Long theatreId) {
        return theatreService.findById(theatreId);
    }
    @GetMapping("region/{regionId}/theatre/{theatreId}")
    public TheatreResponseDTO findTheatreByIdInRegion(@PathVariable("theatreId") Long theatreId) {
        return theatreService.findById(theatreId);
    }

}
