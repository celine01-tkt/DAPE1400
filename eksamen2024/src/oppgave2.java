public class oppgave2 {

    public static double stringDivision(String teller, String nevner) {
        try {
            int tellerTall = Integer.parseInt(teller);
            int nevnerTall = Integer.parseInt(nevner);

            if (tellerTall < 0 || nevnerTall <= 0) {
                return -1.0;
            }

            return (double)tellerTall / nevnerTall;
        }
        catch (NumberFormatException e) {
            return -1.0;
        }
    }

    public static void main(String[] args) {
        System.out.println(stringDivision("3", "2"));
    }
}
