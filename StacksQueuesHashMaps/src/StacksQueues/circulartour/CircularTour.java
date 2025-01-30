package StacksQueues.circulartour;

class CircularTour {
    public static int findStartingPoint(PetrolPump[] pumps) {
        int start = 0;
        int totalFuel = 0;
        int currentFuel = 0;

        for (int i = 0; i < pumps.length; i++) {
            totalFuel += pumps[i].petrol - pumps[i].distance;
            currentFuel += pumps[i].petrol - pumps[i].distance;

            // If fuel goes negative, reset starting point
            if (currentFuel < 0) {
                start = i + 1;
                currentFuel = 0;
            }
        }

        // If total fuel is negative, the journey is not possible
        return (totalFuel >= 0) ? start : -1;
    }
}