// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main Class
public class CustomExceptionExample {
    // Method to check age eligibility
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to proceed.");
        } else {
            System.out.println("Access granted. You are eligible!");
        }
    }

    public static void main(String[] args) {
        int userAge = 16; // Example: User enters age 16

        try {
            checkAge(userAge);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues normally...");
    }
}


