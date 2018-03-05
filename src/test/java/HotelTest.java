import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Bedroom bedroom1;
    Bedroom bedroom2;
    DiningRoom diningRoom1;
    DiningRoom diningRoom2;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;

    @Before
    public void before() {
        hotel = new Hotel("CodeClan Towers");
        guest1 = new Guest("Alex Polizzi");
        guest2 = new Guest("Alan Sucrose");
        guest3 = new Guest("Ruth Watson");
        bedroom1 = new Bedroom(2, 101, 120.00);
        bedroom2 = new Bedroom(4, 111, 150.00);
        diningRoom1 = new DiningRoom(60, "Bistro");
        diningRoom2 = new DiningRoom(80, "Carvery");
        conferenceRoom1 = new ConferenceRoom(120, "The Big Room", 750.00);
        conferenceRoom2 = new ConferenceRoom(40, "The Small Room", 450.00);

    }

    @Test
    public void hotelHasName() {
        assertEquals("CodeClan Towers", hotel.getHotelName());
    }


}
