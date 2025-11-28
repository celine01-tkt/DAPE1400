package modul2;

public class TicketV2 {
    private String name;
    private String peronNr;
    private String destination;

    public TicketV2(String name, String peronNr, String destination) {
        this.name = name;
        this.peronNr = peronNr;
        this.destination = destination;

    }

    public void printTicketInfo() {
        System.out.println("\nBillett informasjon");
        System.out.println("Navn: " + this.name);
        System.out.println("Peron Nr: " + this.peronNr);
        System.out.println("Destination: " + this.destination);
    }

    public void setPassengerInfo(String name, String peronNr, String destination) {
        this.name = name;
        this.peronNr = peronNr;
    }

    public String getDestination() {
        return this.destination;
    }
}
