import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(120, "The Big Room", 750.00);
        guest = new Guest("Allan Sucrose");
    }

    @Test
    public void getName() {
        assertEquals("The Big Room", conferenceRoom.getRoomName());
    }

    @Test
    public void getCapacity() {
        assertEquals(120, conferenceRoom.getCapacity());
    }

    @Test
    public void getRoomRate() {
        assertEquals(750.00, conferenceRoom.getRoomRate(), 0.01);
    }

    @Test
    public void checkDiningRoomEmptyByDefault() {
        assertEquals(0, conferenceRoom.getGuestCount());
    }

    @Test
    public void addGuest() {
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getGuestCount());
    }

}
