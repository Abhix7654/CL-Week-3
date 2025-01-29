package DoublyLinkedList.undoredofunctionality;

public class TextEditor {
    public static void main(String[] args) {
        LinkedList editor = new LinkedList(10);
        editor.addTextState("Hello");


        editor.displayCurrentState(); // Output: Hello
        editor.addTextState("Hello World");
        editor.undo();
        editor.displayCurrentState(); // Output: Hello
        editor.redo();
        editor.displayCurrentState(); // Output: Hello World!
    }
}
