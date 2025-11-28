public class Animal {
    private double length;
    private double width;
    private double height;
    private double weight;

    public Animal(double length, double width, double height, double weight){
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }


    public double getWeight() {
        return this.weight;
    }

    public double getVolume() {
        return length * width * height;
    }


    public void makeSound(){
        System.out.println("");

    }

    public String toString() {
        //returnere størrelsen til dyret
        return "Animal dimensjons: " +
                "\nlength: " + length +
                "\nwidth: " + width +
                "\nheight: " + height +
                "\nweight: " + weight;
    }
}
