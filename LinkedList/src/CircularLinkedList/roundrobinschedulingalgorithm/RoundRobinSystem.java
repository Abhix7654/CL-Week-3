package CircularLinkedList.roundrobinschedulingalgorithm;

public class RoundRobinSystem {
    public static void main(String[] args) {
        RoundRobinLinkedList scheduler = new RoundRobinLinkedList(4);
        scheduler.addProcess(1, 10);
        scheduler.addProcess(2, 4);
        scheduler.addProcess(3, 6);
        scheduler.addProcess(4, 8);

        scheduler.executeProcesses();
    }
}