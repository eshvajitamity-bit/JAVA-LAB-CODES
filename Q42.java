//Q42. Write a program to show multiple catch blocks. 

import java.util.Scanner;
public class MultipleCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input); // May throw NumberFormatException
            int result = 10 / number; // May throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. " + e.getMessage());
        }
    }
}
