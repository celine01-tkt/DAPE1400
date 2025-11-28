public class Dimensions {

    private double length;
    private double width;
    private double height;
    private double weight;

    public double getvolume(){
        return length * width * height;
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
