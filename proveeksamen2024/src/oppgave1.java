public class oppgave1 {
    public void investigateStringArray(String[] strings){
        //teller-variabel
        int totalChars = 0;
        int nullCount = 0;
        System.out.println("Strenger som inneholder 'a':");

        for (String s : strings) {
            if (s == null) {
                nullCount++; //hvis elementet er null, kan vi ikke bruke s.container eller s.length
            } else {
                //1)skriv ut  alle strenger som inneholder 'a'
                if (s.contains("a")) {
                    System.out.println(s);
                }
                //2)legg til lengden på denne strengen i totalen
                totalChars += s.length();
            }
        }
        //3) skriv ut totalen av tegn
        System.out.println("Total tegn i arrayet: " + totalChars);

        //4) skriv ut hvor mange null-verdier
        System.out.println("Antall null-verdier i arrayet: " + nullCount);
    }
}
