package Week2;

public class areaperimeter {
    public static void main(String[] args) {
        // Rectangle dimensions
        double length = 5.5d;
        double bredth = 4d;

        // Calculate area
        double area = length * bredth;

        // Calculate perimeter
        double perimeter = 2 * (length + bredth);

        // Print results
        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}


