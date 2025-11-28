public class Waiter extends Employee {

    private static double tipJAr = 0;

    //constructor
    public Waiter(String name, int age, double salary){
        super(name, age, salary);
    }

    public void takeTips(double tips){
        Waiter.tipJAr += tips;
    }

    public static double getTipJAr(){
        double outTips = Waiter.tipJAr;
        Waiter.tipJAr = 0;
        return outTips;
    }

    public static double distributeTips(int nrOfEmployees){
        double outTips = Waiter.tipJAr;
        Waiter.tipJAr = 0;
        return outTips/nrOfEmployees;
    }


}
