public enum PlaneWeight {

    BOEING747 (18500.00),
    BOEING474400 (17500.00);



    private final double weight;


    PlaneWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

}


