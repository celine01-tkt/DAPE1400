package modul2;

import javax.swing.*;

public class desimaltallAddisjon {
    public static void main(String[] args) {
        //Leser inn to desimaltall fra brukeren:
        String førsteStr = JOptionPane.showInputDialog("Skriv inn første desimaltall");
        String andreStr = JOptionPane.showInputDialog("Skriv inn andre desimaltall");

        //Konverterer til double:
        double d1 = 13.7;
        double d2 = 3.97;

        //Beregner summen:
        double sum = d1 + d2;


        String resultat = "Resultatet ble " + s2;
        // Variabelen resultat inneholder teksten Resultatet ble 22.67
        System.out.println(resultat);
    }
}
