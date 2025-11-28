import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       ArrayList<Animal> animalCargoList = new ArrayList<>();

        Cat cat = new Cat(40,20,10,7);

        Animal catAnimal = cat;

        animalCargoList.add(cat); //holde liste til cat//
        animalCargoList.add(new Dog(50,20,10,10));
        animalCargoList.add(new Cat(20,10,10,7));
        Animal dogAnimal = animalCargoList.get(1);

        for(Animal animal : animalCargoList){
            switch (animal) {
                case Cat cat -> cat.tipGlasssOfShelf();
                case Dog dog -> dog.sniffOutTarget("Trym´s sokker");
                default -> animal.makeSound();
            }
        }



    }
}