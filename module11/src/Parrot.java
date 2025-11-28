public class Parrot extends Bird implements Flyable {

    public Parrot(String name, boolean foodProvider, double beakLength) {
        super(name, foodProvider, beakLength);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " wants a cracker.");
    }

    @Override
    public void fly() {
        System.out.println("I can fly when not in a cage.");
    }

    @Override

    @Override
    public String toString() {
        return "Parrot{}";
    }
}
