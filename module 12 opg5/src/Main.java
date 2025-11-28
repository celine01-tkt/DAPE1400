//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car janice = new Car(3, 5, true, 10);

        Tires tires = janice.getTires();
        tires.setWearPercentage(0);
    }

}