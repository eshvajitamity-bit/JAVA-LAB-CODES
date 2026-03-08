//Q41. Write a program to show finally block. 

public class FinallyBlockExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. " + e.getMessage());
        } finally {
            System.out.println("This block will always execute, regardless of exceptions.");
        }
    }
}
