public class oppgave2 {
    public static double stringDivision(String teller, String nevner) {
        double result;
        try {
            int numberTeller = Integer.parseInt(teller);
            int numberNevner = Integer.parseInt(nevner);
            if (numberTeller < 0 || numberNevner <= 0) { //Avoiding neg number and dividing by 0
                return -1;
            }
            result = (double) numberTeller / numberNevner; //converting to double to get a double result
        } catch (Exception e) {
            return -1;
        }
        return result;
    }
}
