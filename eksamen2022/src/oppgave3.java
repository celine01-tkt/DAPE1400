import static javax.swing.JOptionPane.*;

public class oppgave3 {
    public static void main(String[] args) {
        double vekt, høyde;

        String innVekt = showInputDialog("Skriv inn din vekt i kg:");
        String innHøyde = showInputDialog("Skriv inn din høyde i cm:");

        try{
            vekt = Double.parseDouble(innVekt);
            høyde = Double.parseDouble(innHøyde);
        } catch (Exception e){
            vekt = 0;
            høyde = 0;
        }

        if (vekt <= 0 || høyde <= 0){
            showMessageDialog(null, "Gå ut av programmet. Ikke gyldig input");
        } else {
            double BMI = (1.3 * vekt) / (Math.pow(høyde/100,2.5));
            showMessageDialog(null, "BMI din er : " + String.format("%.2f",BMI));
        }
    }
}
