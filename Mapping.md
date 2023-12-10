    Region - Theatre - Screen - Show - ShowSeat - Seat -  SeatType
    GreaterNoida - PVR - Audi1 - 11,12,2 - 11, F12 - F12 - Platinum
**Mapping**

    Region Theatre      // bi directional
    1:M
    1:1

    Theatre Screen      // uni
    1:M
    1:1

    Screen Seat
    1:M
    1:1

    Show Movie
    M:1
    1:1

    Show Screen
    1:M
    1:1
    
    Show ShowSeat       // bi
    1:M
    1:1

    Seat SeatType
    M:1
    1:1

    User Ticket // bi // at a time can book ony 10 seat so he needs to book multiple ticket
    1:M
    1:1
    
    Show ticket //uni
    1:M
    1:1