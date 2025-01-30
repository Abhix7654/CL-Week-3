package StacksQueues.circulartour;

public class Main {
    public static void main(String[] args) {
        PetrolPump[] pumps = {
                new PetrolPump(4, 6),
                new PetrolPump(6, 5),
                new PetrolPump(7, 3),
                new PetrolPump(4, 5)
        };

        int startIndex = CircularTour.findStartingPoint(pumps);

        if (startIndex != -1) {
            System.out.println("Start at petrol pump index: " + startIndex);
        } else {
            System.out.println("No possible circular tour.");
        }
    }
}
