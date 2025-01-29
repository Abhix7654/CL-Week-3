package DoublyLinkedList.undoredofunctionality;

public class LinkedList {
    private Node head, current;
    private int maxHistory;
    private int size;

    public LinkedList(int maxHistory) {
        this.head = this.current = null;
        this.maxHistory = maxHistory;
        this.size = 0;
    }

    public void addTextState(String text) {
        Node newNode = new Node(text);
        if (head == null) {
            head = current = newNode;


        } else {
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
        }

        size++;
        if (size > maxHistory) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No more undo steps available.");
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("No more redo steps available.");
        }
    }

    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.text);
        } else {
            System.out.println("No text available.");
        }
    }

}
