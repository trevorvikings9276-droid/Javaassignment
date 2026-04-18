import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        // Create Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the radius of the circle
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        // Calculate the diameter: Diameter = 2 × radius
        double diameter = 2 * radius;

        // Calculate the circumference: Circumference = 2 × π × radius
        // Using Math.PI for an accurate value of pi
        double circumference = 2 * Math.PI * radius;

        // Calculate the area: Area = π × radius²
        // Using Math.pow() to square the radius
        double area = Math.PI * Math.pow(radius, 2);

        // Display results formatted to 2 decimal places using printf()
        // %.2f formats a floating-point number with exactly 2 decimal places
        System.out.printf("Diameter = %.2f%n", diameter);
        System.out.printf("Circumference = %.2f%n", circumference);
        System.out.printf("Area = %.2f%n", area);

        // Close the scanner
        scanner.close();
    }
}
