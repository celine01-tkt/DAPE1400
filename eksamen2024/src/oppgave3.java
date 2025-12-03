import java.util.ArrayList;
import java.util.Scanner;

public class oppgave3 {
    public void guessTheAnimal(ArrayList<String> animals) {
        Scanner scanner = new Scanner(System.in);

        boolean ferdig = false; // her skal vi forsette til brukeren sier "x"

        //while-løkke: kjør så lenge vi ikke er ferdig
        while (!ferdig){
            //1. still spørsmål til bruken
            System.out.println("Vil du gjette på et dyr, eller gi opp (tast x)?");
            System.out.println("Hvis du vil gjette, skriv inn dyret (små bokstaver).");

            //2. les det brukeren skriver (en tekstlinje)
            String svar = scanner.nextLine();

            //3. hvis brukeren skriver "x" -> avslutt spillet
            if (svar.equals("x")){
                System.out.println("Ok, sjalabais!");
                ferdig = true; //da stopper while-løkken
            }else {
                //4. brukeren skrevet et dyrenavn
                String gjettetDyr = svar;

                //Sjekk om dyret finnes i lista animals
                if(animals.contains(gjettetDyr)){
                    System.out.println(
                            "Du gjettet riktig - hurra!" + gjettetDyr + " var et av dyrene!"
                    );
                }else {
                    System.out.println(
                            "Hmm, " + gjettetDyr + " var ikke riktig..."
                    );
                }
            }
        }
    }
    public static void main (String[] args){
        ArrayList<String> animals = new ArrayList<>();
        animals.add("katt");
        animals.add("hund");
        animals.add("rev ");

        //lager et oppgave3-objekt
        oppgave3 spill = new oppgave3();

        //starter spillet
        spill.guessTheAnimal(animals);
    }
}

