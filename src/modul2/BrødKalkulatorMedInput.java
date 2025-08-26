package modul2;

import javax.swing.JOptionPane.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class BrødKalkulatorMedInput {
    public static void main(String[] args) {

        double melDl;
        double melkDl;

        String melDlInput;
        melDlInput = showInputDialog("Hvor mye mel har du?");
        String melkDlInput = showInputDialog("Hvor mye melk har du?");
        try {
            melDl = Double.parseDouble(melDlInput);
            melkDl = Double.parseDouble(melkDlInput);
        } catch (Exception e) {
            melDl = 0;
            melkDl = 0;
        }

        double deigDl = melDl - melkDl + melkDl;
        double deigPerBrød = 1.5;

        double antallBrød = deigDl / deigPerBrød;

        showMessageDialog(null, "Du ga ikke tallinputt");
    }
}
