package modul2;

import javax.swing.*;

public class SirkelAreal {
    public static void main(String[] args) {
        //Leser inn radius fra brukeren:
        String radiusStr = JOptionPane.showInputDialog("Skriv inn radien til sirkelen (desimaltall):");

        //Konverterer til double:
        double radius = Double.parseDouble(radiusStr);

        //Konstanten for pi:
        double PI = 3.14;

        //Beregner arealet:
        double areal = PI * radius * radius;

        //Lager resultatmeldinger:
        String resultat = "Arealet av en sirkel med radius " + radius + " er " + areal;

        //Viser resultatet:
        JOptionPane.showMessageDialog(null, resultat,
                "Sirkelen areal", JOptionPane.PLAIN_MESSAGE);
    }
}
