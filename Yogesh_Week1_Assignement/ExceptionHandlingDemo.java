import java.util.Scanner;

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Handling multiple exceptions
        try {
            // ArithmeticException example
            System.out.print("Enter a number to divide 100: ");
            int divisor = scanner.nextInt();
            int result = 100 / divisor;  // May throw ArithmeticException
            System.out.println("Result: " + result);

            // NullPointerException example
            String str = null;
            System.out.println("String length: " + str.length());  // May throw NullPointerException

            // Custom exception example
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            checkAge(age);  // May throw InvalidAgeException

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to access a null object.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // General exception handler
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Code that always runs, regardless of whether an exception occurs
            System.out.println("Execution completed.");
        }

        scanner.close();
    }

    // Method to check age and throw custom exception
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older to proceed.");
        } else {
            System.out.println("Age verified: " + age);
        }
    }
}
