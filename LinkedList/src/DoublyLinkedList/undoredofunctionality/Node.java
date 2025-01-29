package DoublyLinkedList.undoredofunctionality;

class Node {
    String text;
    Node prev, next;

    Node(String text) {
        this.text = text;
        this.prev = this.next = null;
    }
}