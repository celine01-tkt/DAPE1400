import javax.swing.*;
import java.util.ArrayList;

public class oppgave3 {
    public void guessTheAnimal(ArrayList<String> animals) {
        /*be bruker å gjette på et dyr eller gi opp - innhente svar bruk Scanner eller JOption-pane
        hvis bruker gjetter - ta imot - sjekk om den finnes i listen - gi tilbakemld rett eller galt (hint: arraylist)
        hvis bruker gir opp - får avskjedsmld*/

        boolean ferdig = false; //spillet er ikke ferdig

        while (!ferdig){//så lenge vi ikke er ferdig, fortsett å spørre brukeren
            String svar = JOptionPane.showInputDialog(
                    "Vil du gjette på et dyr, eller gi opp (tast x)?\n" +
                    "Hvis du vil gjette, skriv inn dyret (små bokstaver)"
            ); //vi lagrer det brukeren skriver inn i variabelen svar, \n= ny linje (linjeskrift), spør brukeren i et popup-vinduet

            if (svar == null){ //hvis brukeren ikke skrev noe, lukket vinduet og vise melding ok,sjalabais!
                JOptionPane.showMessageDialog(null, "OK, sjalabais!");
                break; //hopp ut av while-løkket med en gang.
            } //hvis brukeren lukker vinduet? (trykker "cancel")

            svar = svar.trim(); //fjerner mellomrom i starten og slutten av svaret

            if (svar.equalsIgnoreCase("x")){ //equalsIgnoreCase("x") sjekk om svaret er x eller X
                JOptionPane.showMessageDialog(null, "Ok, sjalabais!");
                ferdig = true; //nå er spillet ferdig
            }else {
                if (animals.contains(svar)){ //animals.contains(svar) inneholder listen animals dette ordnet som hun skrev
                    JOptionPane.showMessageDialog(null,
                            "Du gjettet riktig - hurra! " + svar + " var et av dyrene!"
                    ); //showMessageDialog vis et vindu med en tekst
                }else { //hvis brukeren har skrevet et dyrenavn, da må vi sjekke det
                    JOptionPane.showMessageDialog(null,
                            "Hmm, " + svar + " var ikke riktig..."
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

        oppgave3 spill = new oppgave3();
        spill.guessTheAnimal(animals);
    }
}

