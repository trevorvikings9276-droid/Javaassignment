public class PatternPrinting {
    public static void main(String[] args) {

        // ===== Pattern 1: Increasing stars =====
        // *
        // **
        // ***
        // ****
        // *****
        System.out.println("Pattern 1:");

        // Outer loop: controls the number of rows (1 to 5)
        for (int i = 1; i <= 5; i++) {
            // Inner loop: prints 'i' stars on each row
            // On row 1, print 1 star; on row 2, print 2 stars; etc.
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print star without newline
            }
            System.out.println(); // Move to the next line after each row
        }

        System.out.println(); // Blank line between patterns

        // ===== Pattern 2: Decreasing stars =====
        // *****
        // ****
        // ***
        // **
        // *
        System.out.println("Pattern 2:");

        // Outer loop: controls the number of rows (5 down to 1)
        for (int i = 5; i >= 1; i--) {
            // Inner loop: prints 'i' stars on each row
            // On row 1 (i=5), print 5 stars; on row 2 (i=4), print 4 stars; etc.
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print star without newline
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
