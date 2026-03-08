//Q47. Write a program to create custom exception

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            validateNumber(150); // This will throw CustomException
        } catch (CustomException e) {
            System.out.println("Caught a custom exception: " + e.getMessage());
        }
    }

    public static void validateNumber(int number) throws CustomException {
        if (number > 100) {
            throw new CustomException("Number must be 100 or less.");
        } else {
            System.out.println("Number is valid.");
        }
    }
}
