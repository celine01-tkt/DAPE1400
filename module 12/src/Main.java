import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<Employee>();


        employees.add(new Chef("Eirik", 34, 600_000));
        employees.add(new Waiter("Trym", 34, 480_000));
        employees.add(new Chef("Harald", 22, 470_000));

        double sumOfSalaries = 0;

        for(Employee employee: employees){
            System.out.println(employee);

            if (employee instanceof Waiter){
               //caster for at employee har ikke taketips klassen
                ((Waiter) employee).takeTips(400);
            }

            sumOfSalaries += employee.getSalary();
        }

        System.out.println("Total employee salary cost: " + sumOfSalaries);

        System.out.println("Each employee gets: " + Waiter.distributeTips(employees.size()));

    }
}