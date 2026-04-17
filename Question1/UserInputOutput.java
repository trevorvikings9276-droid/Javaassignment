import java.util.Scanner; // Import the Scanner class

public class UserInputOutput {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard (System.in)
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their full name and read it using nextLine()
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine(); // nextLine() reads the entire line including spaces

        // Prompt the user for their age and read it using nextInt()
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();// nextInt() reads only an integer value

        // Prompt the user for their height and read it using nextDouble()
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();// nextDouble() reads a floating-point number

        // Display the welcome message with all entered information
        System.out.println();
        System.out.println("Welcome " + fullName + "! You are " + age
                + " years old and " + height + " meters tall.");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
