import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getGuestCount(){
        return this.guests.size();
    }

    public void addGuest(Guest guest){
        if(getGuestCount() < this.capacity) {
            this.guests.add(guest);
        }
    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }

    public ArrayList<Guest> getGuests() {
        return new ArrayList<Guest>(this.guests);
    }
}
