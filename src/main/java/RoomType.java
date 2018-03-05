public enum RoomType {
    SINGLE(1, "Single"),
    DOUBLE(2, "Double"),
    FAMILY(4, "Family");


    private final int roomCapacity;
    private String roomType;

    RoomType(int roomCapacity, String roomType) {
        this.roomCapacity = roomCapacity;
        this.roomType = roomType;
    }

    public int getRoomCapacity() {
        return this.roomCapacity;
    }

    public String getRoomType() {
        return this.roomType;
    }

}
