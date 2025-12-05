public class oppgave4 {
    //Klassen som beskriver en klimagass
    public static class GreenhouseGas{

        //1)Variabler (attributter) som lagrer informasjon om gassen
        private String gasName;
        private double globalWarmingPotential;
        private double emissionInKilotonne;

        //2)Konstruktør: brukes når vi lager et nytt GreenhouseGas-objekt
        public GreenhouseGas(String gasName, double globalWarmingPotential, double emissionInKilotonne){
            this.gasName = gasName;
            this.globalWarmingPotential = globalWarmingPotential;
            this.emissionInKilotonne = emissionInKilotonne;
        }

        //3)Metoden som regner ut hvor mye CO2e denne gassen tilsvarer
        public double calculateEquivalent(){
             return globalWarmingPotential * emissionInKilotonne;
        }

        //4)Metode som lager en pen tekst om gassen
        public String toString(){
            return emissionInKilotonne + " kilotonn " + gasName
                    + " tilsvarer " + calculateEquivalent() + " kilotonn CO2e";
        }
    }

    //klassen med main-metoden (startpunktet for programmet)
    public class GreenhouseCalculator{


        public static void main(String[] args) {

            //5)lager objekter for hver gass med navn, GWP og utslipp
            GreenhouseGas co2 = new GreenhouseGas("CO2",1.0,38869.0);
            GreenhouseGas metan = new GreenhouseGas("metan (CH4)",25.0,171.27);
            GreenhouseGas dinitrogenoksid = new GreenhouseGas("Dinitrogenoksid (N2O)",298.0,8.44);

            //6)legger alle gassene inn i et array
            GreenhouseGas[] gases = {co2,metan,dinitrogenoksid};

            //7)Variabel for å samle total CO2
            double totalCo2e = 0.0;
            /*Vi starter med totalen = 0.
            Hver gang vi regner ut CO₂e for én gass, legger vi den til her.
            (som å ha et “sum-glass” hvor vi tømmer små glass oppi)*/

            //8) for-løkke som går gjennom alle gassene
            for (int i = 0; i < gases.length; i ++){
                GreenhouseGas gas = gases[i]; //9)henter gassen på plass i

                //10)skriv ut en tekstlinje om denne gassen
                System.out.println(gas.toString());

                //11)legg til CO2e-verdien til totalen
                totalCo2e += gas.calculateEquivalent();
            }

            //12)til slutt skriver vi ut total CO2e for alle gassene
            System.out.println("Totalt blir dette " + totalCo2e + " kilotonn Co2e");
        }
    }
}
