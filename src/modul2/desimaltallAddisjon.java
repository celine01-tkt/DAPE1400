package modul2;

import javax.swing.*;

public class desimaltallAddisjon {
    public static void main(String[] args) {
        //Leser inn to desimaltall fra brukeren:
        String førsteStr = JOptionPane.showInputDialog("Skriv inn første desimaltall");
        String andreStr = JOptionPane.showInputDialog("Skriv inn andre desimaltall");

        //Konverterer til double:
        double d1 = Double.parseDouble(førsteStr);
        double d2 = Double.parseDouble(andreStr);

        //Beregner summen:
        double sum = d1 + d2;

        //Lager regnestykket som en streng:
        String resultat = d1 + " + " + d2 + " = " + sum;

        // Viser regnestykket i meldingsboks:
        JOptionPane.showMessageDialog(null, //midt på skjermen
                resultat, //meldingen
                "Resultat av addisjon", //tittle
                JOptionPane.INFORMATION_MESSAGE); //ingen ikon
    }
}
