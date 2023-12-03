package com.scaler.bookmyshow.util;

import com.scaler.bookmyshow.models.*;
import com.scaler.bookmyshow.models.enums.Feature;
import com.scaler.bookmyshow.models.enums.ShowSeatStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

public class DummyObject {
    public Region createObject(){
        Region region1 = new Region();
        region1.setName("Greater Noida");

        //create theatre
        Theatre theatre1 = new Theatre();
        theatre1.setName("PVR");
        theatre1.setRegion(region1);

        region1.setTheatres(List.of(theatre1));
        /*
        //create screen
        Screen screen1 = new Screen();
        screen1.setName("Audi1");
        screen1.setFeatures(List.of(Feature.HD, Feature.DOLBY));

        theatre1.setScreens(List.of(screen1));

        //create seats
        Seat seat11 = new Seat();
        seat11.setRowVal(1);
        seat11.setColVal(1);
        seat11.setSeatNumber("A1");

        SeatType seatType1 = new SeatType();
        seatType1.setName("Silver");
        SeatType seatType2 = new SeatType();
        seatType2.setName("Gold");
        SeatType seatType3 = new SeatType();
        seatType3.setName("Platinum");

        seat11.setSeatType(seatType1);

        Seat seat12 = new Seat();
        seat12.setRowVal(1);
        seat12.setColVal(2);
        seat12.setSeatNumber("A2");
        seat12.setSeatType(seatType1);

        Seat seat13 = new Seat();
        seat13.setRowVal(1);
        seat13.setColVal(3);
        seat13.setSeatNumber("A3");
        seat13.setSeatType(seatType1);

        Seat seat21 = new Seat();
        seat21.setRowVal(2);
        seat21.setColVal(1);
        seat21.setSeatNumber("B1");
        seat21.setSeatType(seatType2);

        Seat seat22 = new Seat();
        seat22.setRowVal(2);
        seat22.setColVal(2);
        seat22.setSeatNumber("B2");
        seat22.setSeatType(seatType2);

        Seat seat23 = new Seat();
        seat23.setRowVal(2);
        seat23.setColVal(3);
        seat23.setSeatNumber("B3");
        seat23.setSeatType(seatType2);

        Seat seat31 = new Seat();
        seat31.setRowVal(3);
        seat31.setColVal(1);
        seat31.setSeatNumber("C1");
        seat31.setSeatType(seatType3);

        Seat seat32 = new Seat();
        seat32.setRowVal(3);
        seat32.setColVal(2);
        seat32.setSeatNumber("C2");
        seat32.setSeatType(seatType3);

        Seat seat33 = new Seat();
        seat33.setRowVal(3);
        seat33.setColVal(3);
        seat33.setSeatNumber("C3");
        seat33.setSeatType(seatType3);
        //////////////////All seat created//////////////////////////
        screen1.setSeats(List.of(seat11,seat12,seat13, seat21, seat22, seat23, seat31,seat32,seat33));


        Show show1 = new Show();
        show1.setStartTime(new Date(2023,12,16,11,40));
        show1.setEndTime(new Date(2023,12,16,14,50));
        show1.setScreen(screen1);

        // movie created
        Movie movie1 = new Movie();
        movie1.setName("Pathan");
        movie1.setDescription("Action Movie");

        // show seat created

        ShowSeat showSeat11 = new ShowSeat();
        showSeat11.setSeat(seat11);
        showSeat11.setPrice(220);
        showSeat11.setShowSeatStatus(ShowSeatStatus.AVAILABALE);
        showSeat11.setShow(show1);
        ShowSeat showSeat12 = new ShowSeat();
        showSeat12.setSeat(seat12);
        showSeat12.setPrice(220);
        showSeat12.setShowSeatStatus(ShowSeatStatus.AVAILABALE);
        showSeat12.setShow(show1);
        ShowSeat showSeat13 = new ShowSeat();
        showSeat13.setSeat(seat13);
        showSeat13.setPrice(220);
        showSeat13.setShowSeatStatus(ShowSeatStatus.AVAILABALE);
        showSeat13.setShow(show1);
        ShowSeat showSeat21 = new ShowSeat();
        showSeat21.setSeat(seat21);
        showSeat21.setPrice(250);
        showSeat21.setShowSeatStatus(ShowSeatStatus.AVAILABALE);
        showSeat21.setShow(show1);
        ShowSeat showSeat22 = new ShowSeat();
        showSeat22.setSeat(seat22);
        showSeat22.setPrice(250);
        showSeat22.setShowSeatStatus(ShowSeatStatus.AVAILABALE);
        showSeat22.setShow(show1);
        ShowSeat showSeat23 = new ShowSeat();
        showSeat23.setSeat(seat23);
        showSeat23.setPrice(250);
        showSeat23.setShowSeatStatus(ShowSeatStatus.AVAILABALE);
        showSeat23.setShow(show1);
        ShowSeat showSeat31 = new ShowSeat();
        showSeat31.setSeat(seat31);
        showSeat31.setPrice(350);
        showSeat31.setShowSeatStatus(ShowSeatStatus.AVAILABALE);
        showSeat31.setShow(show1);
        ShowSeat showSeat32 = new ShowSeat();
        showSeat32.setSeat(seat32);
        showSeat32.setPrice(350);
        showSeat32.setShowSeatStatus(ShowSeatStatus.AVAILABALE);
        showSeat32.setShow(show1);
        ShowSeat showSeat33 = new ShowSeat();
        showSeat33.setSeat(seat33);
        showSeat33.setPrice(350);
        showSeat33.setShowSeatStatus(ShowSeatStatus.AVAILABALE);
        showSeat33.setShow(show1);
        /////////////////all show seat created///////////////

        show1.setMovie(movie1);
        show1.setShowSeats(List.of(showSeat11,showSeat12, showSeat13, showSeat21, showSeat22, showSeat23, showSeat31, showSeat31,showSeat32, showSeat33));
        show1.setFeatures(List.of(Feature.HD, Feature.DOLBY));

         */
        return region1;
    }


    public User createUser(String name, String email, String password){
        User user1 = new User();
        user1.setName(name);
        user1.setEmail(email);
        user1.setPassword(password);
        return user1;
    }
}
