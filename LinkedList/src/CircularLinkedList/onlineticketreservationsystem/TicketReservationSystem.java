package CircularLinkedList.onlineticketreservationsystem;

public class TicketReservationSystem {
    public static void main(String[] args) {
        TicketLinkedList system = new TicketLinkedList();
        system.addTicket(101, "Abhishek", "Avengers", "A1", "10:00 AM");
        system.addTicket(102, "Kumar", "Batman", "B2", "12:00 PM");
        system.addTicket(103, "Rahul", "Superman", "C3", "2:00 PM");

        system.displayTickets();
        system.searchTicket("Batman");
        system.removeTicket(102);
        system.displayTickets();
        system.countTickets();
    }
}
