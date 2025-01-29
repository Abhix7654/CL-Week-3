package CircularLinkedList.onlineticketreservationsystem;

public class TicketLinkedList {
    private Node last;
    private int totalTickets;

    public TicketLinkedList() {
        this.last = null;
        this.totalTickets = 0;
    }

    public void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        Node newNode = new Node(ticketID, customerName, movieName, seatNumber, bookingTime);
        if (last == null) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
        totalTickets++;
    }

    public void removeTicket(int ticketID) {
        if (last == null) {
            System.out.println("No tickets available.");
            return;
        }

        Node curr = last, prev = null;
        do {
            if (curr.ticketID == ticketID) {
                // Case 1: Only one ticket in the list
                if (curr == last && curr.next == last) {
                    last = null;
                } else {
                    // Case 2: Removing the last ticket
                    if (curr == last) {
                        last = prev;
                    }
                    prev.next = curr.next;
                }
                totalTickets--;
                System.out.println("Ticket " + ticketID + " removed.");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != last.next);

        System.out.println("Ticket ID not found.");
    }


    public void displayTickets() {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }
        Node temp = last.next;
        do {
            System.out.println("Ticket ID: " + temp.ticketID + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != last.next);
    }

    public void searchTicket(String query) {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }
        Node temp = last.next;
        boolean found = false;
        do {
            if (temp.customerName.equalsIgnoreCase(query) || temp.movieName.equalsIgnoreCase(query)) {
                System.out.println("Ticket ID: " + temp.ticketID + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != last.next);
        if (!found) {
            System.out.println("No ticket found.");
        }
    }

    public void countTickets() {
        System.out.println("Total booked tickets: " + totalTickets);
    }

}