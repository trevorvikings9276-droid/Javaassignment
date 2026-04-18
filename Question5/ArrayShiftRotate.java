import java.util.Scanner;

public class ArrayShiftRotate {
    public static void main(String[] args) {
        // Create Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Declare an array for 6 integers
        int[] original = new int[6];

        // Accept 6 integers from the user
        System.out.println("Enter 6 integers:");
        for (int i = 0; i < original.length; i++) {
            original[i] = scanner.nextInt();
        }

        // Display the original array
        System.out.print("Original array: ");
        displayArray(original);

        // ===== RIGHT SHIFT BY 1 =====
        // Create a copy of the original array for shift operation
        int[] shifted = new int[original.length];
        // Copy original values into shifted array
        for (int i = 0; i < original.length; i++) {
            shifted[i] = original[i];
        }

        // Save the last element (it will wrap around to the front)
        int lastElement = shifted[shifted.length - 1];

        // Shift all elements one position to the right
        // Start from the end and move each element to the next position
        for (int i = shifted.length - 1; i > 0; i--) {
            shifted[i] = shifted[i - 1]; // Move element from left to right
        }

        // Place the saved last element at the front (index 0)
        shifted[0] = lastElement;

        // Display the shifted array
        System.out.print("After right shift: ");
        displayArray(shifted);

        // ===== LEFT ROTATE BY 2 =====
        // Create a copy of the original array for rotation operation
        int[] rotated = new int[original.length];
        // Copy original values into rotated array
        for (int i = 0; i < original.length; i++) {
            rotated[i] = original[i];
        }

        // Save the first two elements (they will move to the end)
        int first = rotated[0];
        int second = rotated[1];

        // Shift all remaining elements two positions to the left
        for (int i = 0; i < rotated.length - 2; i++) {
            rotated[i] = rotated[i + 2]; // Move element from right to left by 2
        }

        // Place the saved elements at the end of the array
        rotated[rotated.length - 2] = first;
        rotated[rotated.length - 1] = second;

        // Display the rotated array
        System.out.print("After left rotate by 2: ");
        displayArray(rotated);

        // Close the scanner
        scanner.close();
    }

    /**
     * Helper method to display an array in formatted style: [a, b, c, ...]
     * 
     * @param arr the integer array to display
     */
    public static void displayArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", "); // Comma separator between elements
            }
        }
        System.out.println("]");
    }
}
