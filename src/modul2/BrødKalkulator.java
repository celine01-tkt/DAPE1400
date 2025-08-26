package modul2;

public class BrødKalkulator {
        public static void  main (String[] args) {

            double melDl = 2.0, melkDl = 1.0;

            double deigDl = melDl + melkDl;

            double deigDlPerBrød = 2.5;

            double antallBrød = deigDl / deigDlPerBrød;

            String bakerNavn = "Baker Hansen";

            System.out.println(bakerNavn + "kan lage " + antallBrød + " brød");
        }
}
