package modul2;

public class TicketV1 {
    public
    String name;
    String personNr;
    String destination;

    pulic TicketV1 (String name, String personNr, String destination){
        this.name = name;
        this.personNr = personNr;
        this.destination = destination;
    }

    public void printTicketInfo{
        System.out.println("\n" + "Ticket info");
        System.out.println("Name: " + this.name);
        System.out.println("Person NR: " + this.personNr);
        System.out.println("Destination: " + this.destination);
    }
}
