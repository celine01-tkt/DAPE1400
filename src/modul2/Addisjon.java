package modul2;

import javax.swing.*;

public class Addisjon {
    public static void main(String[] args) {
        String førsteSifferstreng;
        String andreSifferstreng;

        int førstetall;
        int andretall;
        int sum;

        //Leser inn første tall fra bruker i fprm av en sifferstreng:
        førsteSifferstreng = JOptionPane.showInputDialog("Skriv inn første tall");

        //Leser inn andre tall fra bruker i form av en sifferstreng:
        andreSifferstreng = JOptionPane.showInputDialog("Skriv inn andretall");

        //Konverterer sifferstrengene til tallverdier:
        førstetall = Integer.parseInt(førsteSifferstreng);
        andretall = Integer.parseInt(andreSifferstreng);

        //Adderer tallene og lagrer summen i variabelen sum:
        sum = førstetall + andretall;

        //Lager regnestykket:
        String regnestykke = førstetall + " + " + andretall + " = " + sum;

        //Viser resultatet:
        JOptionPane.showInputDialog(null,
                regnestykke,
                "Resultatet av addisjon",
                JOptionPane.PLAIN_MESSAGE
        );

    }//Slutt på main-metoden
}//Slutt på klassen Addisjon
