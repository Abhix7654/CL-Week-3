package StacksQueues.circulartour;

public class Main {
    public static void main(String[] args) {
        PetrolPump[] pumps = {
                new PetrolPump(9, 6),
                new PetrolPump(6, 1),
                new PetrolPump(5, 3),
                new PetrolPump(2, 4)
        };

        int startIndex = CircularTour.findStartingPoint(pumps);

        if (startIndex != -1) {
            System.out.println("Start at petrol pump index: " + startIndex);
        } else {
            System.out.println("No possible circular tour.");
        }
    }
}
