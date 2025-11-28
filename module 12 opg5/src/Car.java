public class Car {
    private double[] position;
    private Tires tires;

    public Car(double x, double y, boolean winterTire, double wearPercentage) {
        this.position = new double[2];
        this.position[0] = x;
        this.position[1] = y;
        this.tires = new Tires(winterTire, wearPercentage);
    }

    public Tires getTires() {
        return this.tires;
    }

    public void move(double[] position){
        this.position[0] = position[0];
        this.position[1] = position[1];
    }


