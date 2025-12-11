import java.util.ArrayList;

public class oppgave5 {
    static class Bok{
        private String tittel;
        private String forfatter;
        private double pris;

        public Bok(String tittel, String forfatter, double pris){
            this.tittel = tittel;
            this.forfatter = forfatter;
            this.pris = pris;
        }

        @Override
        public String toString(){
            return "Titte=" + tittel + ", Forfatter=" + forfatter + ", Pris=" + pris;
        }
    }

    static class Lydbok extends Bok{
        private int lengdelminutter;

        public Lydbok(String tittel, String forfatter, double pris, int lengdelminutter){
            super(tittel, forfatter, pris);
            this.lengdelminutter = lengdelminutter;
        }

        @Override
        public String toString(){
            return super.toString() + ", LengdeIminmutter=" + lengdelminutter;
        }
    }

    static class Papirbok extends Bok{
        private int ISBN;

        public Papirbok(String tittel, String forfatter, double pris, int ISBN){
            super (tittel, forfatter, pris);
            this.ISBN = ISBN;
        }
        @Override
        public String toString(){
            return super.toString() + ", ISBN=" + ISBN;
        }
    }

    public static void main(String[] args) {
        Bok papirBok1 = new Papirbok("Min Hundebok","Debon",299,923721);
        Bok lydBok = new Lydbok("Tur i skogen", "Henry", 599, 180);

        // 2. Lag en ArrayList av type Bok
        ArrayList<Bok> bokListe = new ArrayList<>();

        // 3. Legg bøkene inn i lista
        bokListe.add(lydBok);
        bokListe.add(papirBok1);

        // 4. Skriv ut alle med toString i en løkke
        for (Bok b : bokListe) {
            System.out.println(b);  // toString() blir automatisk brukt
    }
}
}


