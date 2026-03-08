//Q12. Write a program to find greater number out of two using ternary operator.

import java.util.Scanner;

public class TernaryMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();

        int max = (n1 > n2) ? n1 : n2;

        System.out.println("The greater number is: " + max);
    }
}