public class Dog extends Mammal {

    private boolean canFetchNewsPaper;
´
    public Dog(String name, boolean foodProvider, int nrOfTeats, boolean canFetchNewsPaper) {
        super(name, foodProvider, nrOfTeats);
        this.canFetchNewsPaper = canFetchNewsPaper;
    }
}
    @Override
    public void makeSound(){
        System.out.println("Voff,voff!");
    }
