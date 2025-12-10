import java.util.Scanner;

public class oppgave4 {
    class KonverterTemperatur{
        public static double tilCelsius (double fahrenheit){
            return (fahrenheit - 32) / 1.8;
        }

        public static double tilFahrenheiht (double celsius){
            return celsius * 1.8 + 32;
        }
    }

    public static void main(String[] args) {
        double f = 100;
        double c = KonverterTemperatur.tilCelsius(f);
        System.out.println(f + " Fahrenheit er " + String.format("%.2f",c) + " Celsius");

        double c2 = 25;
        double f2 = KonverterTemperatur.tilFahrenheiht(c2);
        System.out.println(c2 + " Celsius er " + String.format("%.2f",f2) + " Fahrenheit");
    }
}
