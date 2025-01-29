package CircularLinkedList.taskscheduler;

public class TaskSchedulerSystem {
    public static void main(String[] args) {
        TaskLinkedList scheduler = new TaskLinkedList();

        scheduler.addTaskAtEnd(1, "Task A", 2, "2025-02-10");
        scheduler.addTaskAtBeginning(2, "Task B", 1, "2025-02-05");
        scheduler.addTaskAtEnd(3, "Task C", 3, "2025-02-15");

        System.out.println("Task list:");
        scheduler.displayTasks();

        System.out.println("\nViewing and moving to the next task:");
        scheduler.viewCurrentAndNext();
        scheduler.viewCurrentAndNext();

        System.out.println("\nSearching for tasks with priority 1:");
        scheduler.searchByPriority(1);

        System.out.println("\nRemoving Task C:");
        scheduler.removeTask(3);
        scheduler.displayTasks();
    }
}