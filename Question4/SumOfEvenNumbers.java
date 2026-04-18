public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Display section header
        System.out.println("=== SUM OF EVEN NUMBERS (1 to 100) ===");

        // Variables to accumulate the sum and count of even numbers
        int sum = 0;    // Accumulator to store the running sum
        int count = 0;  // Counter for even numbers found

        // for loop iterates from 1 to 100 (inclusive)
        // Checks each number to see if it is even
        for (int i = 1; i <= 100; i++) {
            // Use modulus operator to check if the current number is even
            // A number is even if it is divisible by 2 (remainder is 0)
            if (i % 2 == 0) {
                sum += i;    // Add the even number to the sum
                count++;     // Increment the count of even numbers
            }
        }

        // Calculate the average of even numbers
        // Cast to double for accurate decimal division
        double average = (double) sum / count;

        // Display the results
        System.out.println("Sum of even numbers: " + sum);
        System.out.println("Count of even numbers: " + count);
        System.out.println("Average of even numbers: " + average);
    }
}
