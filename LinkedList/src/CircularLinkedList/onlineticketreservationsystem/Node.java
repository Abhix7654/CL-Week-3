package CircularLinkedList.onlineticketreservationsystem;

class Node {
    int ticketID;
    String customerName, movieName, seatNumber, bookingTime;
    Node next;

    Node(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}