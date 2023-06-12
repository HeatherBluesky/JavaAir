public class Plane {


    private String name;
    private PlaneCapacity capacity;
    private PlaneWeight weight;

    public Plane(String name, PlaneCapacity capacity, PlaneWeight weight) {
        this.name = name;
        this.capacity = capacity;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public PlaneCapacity getCapacity() {
        return capacity;
    }

    public PlaneWeight planeWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(PlaneCapacity capacity) {
        this.capacity = capacity;
    }

    public void setWeight(PlaneWeight weight) {
        this.weight = weight;
    }
}
