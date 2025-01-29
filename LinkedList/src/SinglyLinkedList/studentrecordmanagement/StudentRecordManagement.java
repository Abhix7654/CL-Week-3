package SinglyLinkedList.studentrecordmanagement;

public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentLinkedList records = new StudentLinkedList();

        // Add sample records
        records.insertFront(101, "Abhi", 20, 'A');
        records.insertEnd(103, "Raj", 22, 'B');
        records.insertAtPosition(102, "Muskan", 21, 'A', 1);

        // Display initial records
        records.displayAll();

        // Search and update
        StudentNode found = records.searchByRollNumber(102);
        if (found != null) {
            System.out.println("Found student: " + found.name);
        }
        records.updateGrade(102, 'B');

        // Delete a record
        records.deleteByRollNumber(101);
        records.displayAll();

        // Edge case testing
        records.insertAtPosition(104, "David", 23, 'C', 5); // Invalid position
        records.insertEnd(105, "Eve", 24, 'A');
        records.displayAll();
    }
}
