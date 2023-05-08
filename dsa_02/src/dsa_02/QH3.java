package dsa_02;

class Distance {
    int meters;
    int centimeters;

    Distance(int meters, int centimeters) {
        this.meters = meters;
        this.centimeters = centimeters;
    }

    void display() {
        System.out.println("Meters: " + meters);
        System.out.println("Centimeters: " + centimeters);
    }

    static Distance sum(Distance d1, Distance d2) {
        int totalCentimeters = d1.centimeters + d2.centimeters;
        int totalMeters = d1.meters + d2.meters + totalCentimeters / 100;
        totalCentimeters %= 100;
        return new Distance(totalMeters, totalCentimeters);
    }
}

public class QH3 {
    public static void main(String[] args) {
        Distance d1 = new Distance(3, 50);
        Distance d2 = new Distance(2, 75);

        System.out.println("Distance 1:");
        d1.display();

        System.out.println("Distance 2:");
        d2.display();

        Distance d3 = Distance.sum(d1, d2);

        System.out.println("Sum of Distances:");
        d3.display();
    }
}