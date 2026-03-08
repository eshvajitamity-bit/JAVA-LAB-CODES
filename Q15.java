//Q15. Write a program to print tables and write a program to print reverse tables  

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print its table: ");
        int num = scanner.nextInt();

        System.out.println("--- Standard Table ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        System.out.println("\n--- Reverse Table ---");
        for (int i = 10; i >= 1; i--) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}