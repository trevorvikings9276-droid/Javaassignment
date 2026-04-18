import java.util.Scanner;

public class RelationalLogicalOperators {
    public static void main(String[] args) {
        // Create Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Accept two integers from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Relational operator: Greater than (>)
        // Returns true if num1 is strictly greater than num2
        System.out.println(num1 + " is greater than " + num2 + ": " + (num1 > num2));

        // Relational operator: Less than (<)
        // Returns true if num1 is strictly less than num2
        System.out.println(num1 + " is less than " + num2 + ": " + (num1 < num2));

        // Relational operator: Equal to (==)
        // Returns true if both numbers have the same value
        System.out.println(num1 + " is equal to " + num2 + ": " + (num1 == num2));

        // Logical AND (&&): Both conditions must be true
        // Checks if both numbers are even using the modulus operator
        boolean bothEven = (num1 % 2 == 0) && (num2 % 2 == 0);
        System.out.println("Both numbers are even: " + bothEven);

        // Logical OR (||): At least one condition must be true
        // Checks if at least one of the numbers is positive (greater than 0)
        boolean atLeastOnePositive = (num1 > 0) || (num2 > 0);
        System.out.println("At least one number is positive: " + atLeastOnePositive);

        // Close the scanner
        scanner.close();
    }
}
