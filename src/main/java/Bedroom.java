public class Bedroom extends Room {

    private int bedroomNumber;
//    private RoomType  roomCapacity;
//    private RoomType roomType;
    private double roomRate;


//    public Bedroom(int capacity, int bedroomNumber, RoomType roomCapacity, RoomType roomType, double roomRate) {
    public Bedroom(int capacity, int bedroomNumber, double roomRate) {
        super(capacity);
        this.bedroomNumber = bedroomNumber;
//        this.roomCapacity = roomCapacity;
//        this.roomType = roomType;
        this.roomRate = roomRate;
    }

    public int getBedroomNumber() {
        return this.bedroomNumber;
    }

    public double getRoomRate() {
        return this.roomRate;
    }


}
