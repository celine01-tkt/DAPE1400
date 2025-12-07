public class oppgave1 {
    public static void main(String[] args) {
        //a)tall som er større enn 10
        int[] liste = { -3, 41, 5, -3, 2, 49};
        int teller = 0;

        for (int i : liste){
            if(i>10){
                teller++;
            }
        }
        System.out.println("Antall tall som er større enn 10 er: " + teller);

        //b)annethvert element
        System.out.print("Annethvert tall: ");
        for (int i = 0; i < liste.length; i += 2){
            System.out.print(liste[i] + " ");
        }
        System.out.println();


        //c)summen av alle positive tall
        int sum = 0;
        int antallPositive = 0;

        for (int i : liste){
            if( i > 0 ){
                sum += i;
                antallPositive++;
            }
        }
        System.out.println("Summen av alle positive tall er: " + sum);

        //d)gjennomsnittet av alle positive tall i arrayet
        double gjennomsnitt = (double) sum / antallPositive;
        System.out.println("Gjennomsnittet av alle de positive tallene er: "  + gjennomsnitt);
    }
}
