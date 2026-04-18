import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        // Create Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Declare an array to store marks for 8 students
        int[] marks = new int[8];

        // Accept marks from the user using a for loop
        System.out.println("Enter marks for 8 students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt(); // Store each mark in the array
        }

        // Initialize variables for analysis
        int highest = marks[0];  // Assume the first mark is the highest
        int lowest = marks[0];   // Assume the first mark is the lowest
        int sum = 0;             // Accumulator for total marks
        int passCount = 0;       // Counter for students who passed
        int failCount = 0;       // Counter for students who failed

        // Traverse the array to perform analysis
        for (int i = 0; i < marks.length; i++) {
            // Add current mark to the running sum
            sum += marks[i];

            // Update highest if current mark is greater
            if (marks[i] > highest) {
                highest = marks[i];
            }

            // Update lowest if current mark is smaller
            if (marks[i] < lowest) {
                lowest = marks[i];
            }

            // Check if the student passed (marks >= 50) or failed (marks < 50)
            if (marks[i] >= 50) {
                passCount++; // Increment pass counter
            } else {
                failCount++; // Increment fail counter
            }
        }

        // Calculate the average (cast to double for decimal precision)
        double average = (double) sum / marks.length;

        // Display the analysis results
        System.out.println();
        System.out.println("Highest mark: " + highest);
        System.out.println("Lowest mark: " + lowest);
        System.out.println("Sum of marks: " + sum);
        System.out.println("Average marks: " + average);
        System.out.println("Number of students who passed: " + passCount);
        System.out.println("Number of students who failed: " + failCount);

        // Display all marks in reverse order using a for loop
        System.out.println();
        System.out.println("Marks in reverse order:");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.print(marks[i] + " "); // Print each mark separated by space
        }
        System.out.println(); // Final newline

        // Close the scanner
        scanner.close();
    }
}
