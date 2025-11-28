public abstract class Bird extends Animal {
    public Bird(String name, boolean foodProvider, double beakLength) {
        super(name, foodProvider);
        this.beakLength = beakLength;
    }

    private double beakLength;

    public double getBeakLength() {
        return beakLength;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name=" + name + '\'' +
                ", foodProvider=" + foodProvider +
                '}';
    }
}
