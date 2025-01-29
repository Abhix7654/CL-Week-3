package SinglyLinkedList.studentrecordmanagement;

class StudentLinkedList {
    private StudentNode head;

    // Insert at beginning (O(1))
    public void insertFront(int rollNumber, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end (O(n))
    public void insertEnd(int rollNumber, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }

        StudentNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Insert at specific position (O(n))
    public void insertAtPosition(int rollNumber, String name, int age, char grade, int position) {
        if (position < 0) {
            System.out.println("Invalid position!");
            return;
        }

        if (position == 0) {
            insertFront(rollNumber, name, age, grade);
            return;
        }

        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        StudentNode current = head;
        int currentPosition = 0;

        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        if (current == null) {
            System.out.println("Position out of bounds!");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete by roll number (O(n))
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) return;

        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }

        StudentNode current = head;
        while (current.next != null && current.next.rollNumber != rollNumber) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Search by roll number (O(n))
    public StudentNode searchByRollNumber(int rollNumber) {
        StudentNode current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Update grade (O(n))
    public void updateGrade(int rollNumber, char newGrade) {
        StudentNode student = searchByRollNumber(rollNumber);
        if (student != null) {
            student.grade = newGrade;
        }
    }

    // Display all records (O(n))
    public void displayAll() {
        StudentNode current = head;
        System.out.println("\nStudent Records:");
        while (current != null) {
            System.out.printf("Roll: %d  Name: %-10s  Age: %-3d  Grade: %c%n",
                    current.rollNumber, current.name, current.age, current.grade);
            current = current.next;
        }
        System.out.println();
    }
}
