//Q38. Write a program to show ArithmeticException. 

public class Q38 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. " + e.getMessage());
        }
    }
}
