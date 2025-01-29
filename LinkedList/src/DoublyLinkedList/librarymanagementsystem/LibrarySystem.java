package DoublyLinkedList.librarymanagementsystem;

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryLinkedList library = new LibraryLinkedList();

        library.addBookAtEnd("The Alchemist", "Abhishek", "Fiction", 101, true);
        library.addBookAtBeginning("1984", "Raj kumar", "Dystopian", 102, false);
        library.addBookAtEnd("To Kill a Mockingbird", "Spiderman", "Classic", 103, true);

        System.out.println("Library books (forward):");
        library.displayBooksForward();

        System.out.println("\nUpdating availability of '1984' to Available:");
        library.updateAvailability(102, true);
        library.displayBooksForward();

        System.out.println("\nSearching for book by author 'Spiderman':");
        library.searchBook("", "Spiderman");

        System.out.println("\nTotal books in library: " + library.countBooks());

        System.out.println("\nRemoving 'To Kill a Mockingbird':");
        library.removeBook(103);
        library.displayBooksForward();
    }
}