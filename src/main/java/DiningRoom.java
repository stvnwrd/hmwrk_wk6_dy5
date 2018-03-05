public class DiningRoom extends Room{

    private String roomName;

    public DiningRoom(int capacity, String roomName) {
        super(capacity);
        this.roomName = roomName;
    }

    public String getRoomName() {
        return this.roomName;
    }
}
