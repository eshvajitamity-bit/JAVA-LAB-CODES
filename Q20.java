//Q20. Write a program to reverse the given digits and sum of the digits

import java.util.Scanner;
public class ReverseAndSumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int reversed = 0;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            sum += digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
        System.out.println("Sum of Digits: " + sum);
    }
}