package DoublyLinkedList.librarymanagementsystem;

 class LibraryLinkedList {


        private BookNode head;
        private BookNode tail;
        private int count;

        public LibraryLinkedList() {
            head = null;
            tail = null;
            count = 0;
        }

        // Add book at the beginning
        public void addBookAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
            BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);
            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            count++;
        }

        // Add book at the end
        public void addBookAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
            BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);
            if (tail == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            count++;
        }

        // Remove book by ID
        public void removeBook(int bookId) {
            BookNode temp = head;
            while (temp != null && temp.bookId != bookId) {
                temp = temp.next;
            }
            if (temp == null) return;

            if (temp == head) head = head.next;
            if (temp == tail) tail = tail.prev;
            if (temp.next != null) temp.next.prev = temp.prev;
            if (temp.prev != null) temp.prev.next = temp.next;
            count--;
        }

        // Search book by Title or Author
        public void searchBook(String title, String author) {
            BookNode temp = head;
            while (temp != null) {
                if (temp.title.equalsIgnoreCase(title) || temp.author.equalsIgnoreCase(author)) {
                    System.out.println(temp.bookId + " | " + temp.title + " | " + temp.author + " | " + temp.genre + " | " + (temp.isAvailable ? "Available" : "Not Available"));
                }
                temp = temp.next;
            }
        }

        // Update availability status
        public void updateAvailability(int bookId, boolean isAvailable) {
            BookNode temp = head;
            while (temp != null) {
                if (temp.bookId == bookId) {
                    temp.isAvailable = isAvailable;
                    return;
                }
                temp = temp.next;
            }
        }

        // Display all books forward
        public void displayBooksForward() {
            BookNode temp = head;
            while (temp != null) {
                System.out.println(temp.bookId + " | " + temp.title + " | " + temp.author + " | " + temp.genre + " | " + (temp.isAvailable ? "Available" : "Not Available"));
                temp = temp.next;
            }
        }

        // Display all books in reverse order
        public void displayBooksReverse() {
            BookNode temp = tail;
            while (temp != null) {
                System.out.println(temp.bookId + " | " + temp.title + " | " + temp.author + " | " + temp.genre + " | " + (temp.isAvailable ? "Available" : "Not Available"));
                temp = temp.prev;
            }
        }

        // Count total books
        public int countBooks() {
            return count;
        }
    }
