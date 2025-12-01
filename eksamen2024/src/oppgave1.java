public class oppgave1 {
    public void investigateIntArray(int[] ints, int number){

        //ints som er mindre enn 0
        int mindreEnnNull = 0;

        //summen av alle verdier
        int sum = 0;

        for (int i = 0; i < ints.length; i++){
            int currentInt = ints[i];

            if (currentInt < 0){
                mindreEnnNull++; //øker med 1
            }
            sum += currentInt; //sum = sum + currentInt
        }
        System.out.println("Mindre enn null: " + mindreEnnNull);
        System.out.println("Sum av alle verdier: " + sum);

        //største verdi
        int storteverdi = ints[0];
        for (int i = 1; i < ints.length; i++){
            int currentInt = ints[i];

            if (currentInt > storteverdi){
                storteverdi = currentInt;
            }
        }
        System.out.println("Storteverdi: " + storteverdi);
    }
}
