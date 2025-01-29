package CircularLinkedList.roundrobinschedulingalgorithm;

 class RoundRobinLinkedList {
     private ProcessNode head = null;
     private ProcessNode tail = null;
     private int timeQuantum;

     public RoundRobinLinkedList(int timeQuantum) {
         this.timeQuantum = timeQuantum;
     }

     // Add a process at the end
     public void addProcess(int processId, int burstTime) {
         ProcessNode newProcess = new ProcessNode(processId, burstTime);
         if (head == null) {
             head = tail = newProcess;
             tail.next = head; // Circular link
         } else {
             tail.next = newProcess;
             newProcess.next = head;
             tail = newProcess;
         }
     }

     // Remove a process by Process ID
     public void removeProcess(int processId) {
         if (head == null) return;
         ProcessNode temp = head, prev = null;
         do {
             if (temp.processId == processId) {
                 if (temp == head && temp == tail) {
                     head = tail = null;
                 } else {
                     if (temp == head) head = head.next;
                     if (temp == tail) tail = prev;
                     if (prev != null) prev.next = temp.next;
                 }
                 return;
             }
             prev = temp;
             temp = temp.next;
         } while (temp != head);
     }

     // Simulate Round Robin Scheduling
     public void executeProcesses() {
         if (head == null) return;
         ProcessNode current = head;
         int time = 0;
         System.out.println("Executing Round Robin Scheduling with Time Quantum: " + timeQuantum);

         while (head != null) {
             if (current.remainingTime > 0) {
                 int executeTime = Math.min(timeQuantum, current.remainingTime);
                 current.remainingTime -= executeTime;
                 time += executeTime;
                 System.out.println("Process " + current.processId + " executed for " + executeTime + " units. Remaining: " + current.remainingTime);
                 if (current.remainingTime == 0) {
                     System.out.println("Process " + current.processId + " completed at time " + time);
                     removeProcess(current.processId);
                 }
             }
             current = current.next;
         }
     }
 }
