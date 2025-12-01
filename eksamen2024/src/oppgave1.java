public class oppgave1 {
    public void investigateIntArray(int[] ints, int number){

        //ints som er mindre enn 0
        int mindreEnnNull = 0;

        //summen av alle verdier
        int sum = 0;

        //for hvert tall i arrayet
        for (int i = 0; i < ints.length; i++){
            int currentInt = ints[i];

            if (currentInt < 0){
                mindreEnnNull++; //øker med 1
            }

            //summen av alle verdier
            sum += currentInt; //sum = sum + currentInt

            //skriv ut alle tall i arrayet ints som er delelig med number (modulo)
            if (number != 0){
                if(currentInt % number == 0){
                    System.out.println(currentInt + " er delelig med" + number);
                }
            }
        }
        System.out.println("Mindre enn null: " + mindreEnnNull);
        System.out.println("Sum av alle verdier: " + sum);

        //største verdi
        int storteverdi = ints[0];

        //minste verdi
        int minsteverdi = ints[0];

        for (int i = 1; i < ints.length; i++){
            int currentInt = ints[i];

            if (currentInt > storteverdi){
                storteverdi = currentInt;
            }
            if (currentInt < minsteverdi){
                minsteverdi = currentInt;
            }
        }
        System.out.println("Storteverdi: " + storteverdi);
        System.out.println("Minsteverdi: " + minsteverdi);
    }
}
