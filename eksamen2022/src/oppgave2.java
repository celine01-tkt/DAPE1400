public class oppgave2 {
    /*class Liste {
    array
    skal ha 3 metoder som gjør ting med en liste (array) av tall:
    1. finn hvor mange tall som er større enn 0.
    2. finn hvor mange ganger et bestemt tall dukket opp
    3. finn et største tallet i arrayet.
     */

    class Liste{

        public static int positive (int [] liste){
            int teller = 0; //teller stater på 0, og teller hvor mange tall som er positive.
            for (int i : liste){
                if(i > 0){
                    teller++; //legger til 1
                }
            }
            return teller;
        }

        public static int antallTall(int [] liste, int tall){
            int teller = 0;
            for (int i : liste){
                if(i == tall){
                    teller++;
                }
            }
            return teller;
        }

        public static int størst (int [] liste){
            int størst = liste[0];
            for (int i : liste){
                if(i > størst){
                    størst = i;
                }
            }
            return størst;
        }
    }

    public static void main(String[] args){
        int [] liste = {1,2,4,-45,6,1,2};
        System.out.println("Antall positive tall i lista er " + Liste.positive(liste));
        System.out.println("Antallet enere i listen er " + Liste.antallTall(liste, 1));
        System.out.println("Det største tallet i listen er " + Liste.størst(liste));
    }
}
