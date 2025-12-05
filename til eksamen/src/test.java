import java.awt.*;

public class test {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Tom", "red", 30);
        Robot robot2 = new Robot("Jerry", "blue", 40);
        robot1.introduceSelf();
        robot2.introduceSelf();
    }
}

class Robot {
    String name;
    String color;
    int weight;

    Robot (String n, String c, int a){
        this.name = n;
        this.color = c;
        this.weight = a;
    }

    void introduceSelf(){
        System.out.println("Name: " + this.name
        + ", color: " + this.color + ", weight: " + this.weight);
    }
}
