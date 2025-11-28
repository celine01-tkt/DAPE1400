public class Cat extends Animal {
    public Cat(double length, double width, double height, double weight) {
        super(length, weight,  height, weight);
    }

    public void tipGlasssOfShelf(){
        System.out.println("Crash");
    }

    public void makeSound(){
        System.out.println("Mjaul!");
    }

    public String toString(){
        String out = "This is a cat \n";
        out += super.toString();
        return out;

    }


}

