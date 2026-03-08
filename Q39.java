//Q39. Write a program to show NumberFormatException. 

import java.util.Scanner;
public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input); 
            System.out.println("You entered the number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. " + e.getMessage());
        }
    }
}
