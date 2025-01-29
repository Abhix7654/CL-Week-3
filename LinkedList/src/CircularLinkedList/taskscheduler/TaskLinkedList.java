package CircularLinkedList.taskscheduler;

public class TaskLinkedList {
    private TaskNode head;

    public TaskLinkedList() {
        head = null;
    }

    // Add task at the beginning
    public void addTaskAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    // Add task at the end
    public void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Remove a task by ID
    public void removeTask(int taskId) {
        if (head == null) return;
        TaskNode temp = head, prev = null;
        do {
            if (temp.taskId == taskId) {
                if (prev != null) {
                    prev.next = temp.next;
                } else {
                    TaskNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    // View current task and move to the next
    public void viewCurrentAndNext() {
        if (head == null) return;
        TaskNode temp = head;
        System.out.println("Current Task: " + temp.taskName);
        head = head.next;
    }

    // Display all tasks
    public void displayTasks() {
        if (head == null) return;
        TaskNode temp = head;
        do {
            System.out.println(temp.taskId + " | " + temp.taskName + " | " + temp.priority + " | " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search task by priority
    public void searchByPriority(int priority) {
        if (head == null) return;
        TaskNode temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println(temp.taskId + " | " + temp.taskName + " | " + temp.priority + " | " + temp.dueDate);
            }
            temp = temp.next;
        } while (temp != head);
    }
}
