import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom(2, 101, 120.00);
        guest = new Guest("Alex Polizzi");
    }

    @Test
    public void getName() {
        assertEquals(101, bedroom.getBedroomNumber());
    }

    @Test
    public void getCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void getRoomRate() {
        assertEquals(120.00, bedroom.getRoomRate(), 0.01);
    }

    @Test
    public void checkDiningRoomEmptyByDefault() {
        assertEquals(0, bedroom.getGuestCount());
    }

    @Test
    public void addGuest() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuestCount());
    }


}
