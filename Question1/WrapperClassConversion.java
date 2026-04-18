import javax.swing.JOptionPane;

public class WrapperClassConversion {
    public static void main(String[] args) {
         // Accept the first number as a String using JOptionPane
        String firstString = JOptionPane.showInputDialog("Enter the first number:");

        // Accept the second number as a String using JOptionPane
        String secondString = JOptionPane.showInputDialog("Enter the second number:");

        // Convert the String inputs to integers using Integer.parseInt()
        // parseInt() is a static method of the Integer wrapper class
        int firstNumber = Integer.parseInt(firstString);
        int secondNumber = Integer.parseInt(secondString);

        // Perform arithmetic operations
        int sum = firstNumber + secondNumber;           // Addition
        int difference = firstNumber - secondNumber;    // Subtraction
        int product = firstNumber * secondNumber;       // Multiplication
        int quotient = firstNumber / secondNumber;      // Integer division

        // Build the result message with all calculations
        String result = "ARITHMETIC CALCULATOR \n"
                + "First number: " + firstNumber + "\n"
                + "Second number: " + secondNumber + "\n"
                + "Sum: " + sum + "\n"
                + "Difference: " + difference + "\n"
                + "Product: " + product + "\n"
                + "Quotient: " + quotient;

        // Display results in a message dialog box
        JOptionPane.showMessageDialog(null, result,
                "Arithmetic Results", JOptionPane.INFORMATION_MESSAGE);

        // Also print results to the console
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Exit the application
        System.exit(0);
    }
}
