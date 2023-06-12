public enum PlaneCapacity {

    BOEING747 (416, 18500.00),
    BOEING474400 (568, 17500.00);



    private final int capacity;



    PlaneCapacity(int capacity, double weight) {
        this.capacity = capacity;


    }


    public int getCapacity() {
        return capacity;
    }


}
