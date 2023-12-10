package com.scaler.bookmyshow.archieve.dto;

import com.scaler.bookmyshow.models.Movie;
import lombok.Data;

import java.util.Date;

@Data
public class ShowResponseDTO {
    private Long showId;
    private Date startTime;
    private Date endTime;

}
