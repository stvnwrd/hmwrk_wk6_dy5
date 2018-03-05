import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void before() {
        diningRoom = new DiningRoom(30, "Ulehavhadyrtea");
        guest = new Guest("Alex Polizzi");
    }

    @Test
    public void getName() {
        assertEquals("Ulehavhadyrtea", diningRoom.getRoomName());
    }

    @Test
    public void getCapacity() {
        assertEquals(30, diningRoom.getCapacity());
    }

    @Test
    public void checkDiningRoomEmptyByDefault() {
        assertEquals(0, diningRoom.getGuestCount());
    }

    @Test
    public void addGuest() {
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.getGuestCount());
    }
}
