import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Alex Polizzi");
    }

    @Test
    public void hasName() {
        assertEquals("Alex Polizzi", guest.getName());
    }

    @Test
    public void setName() {
        guest.setName("Ruth Watson");
        assertEquals("Ruth Watson", guest.getName());
    }
}
