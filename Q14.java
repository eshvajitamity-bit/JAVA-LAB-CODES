//Q14. Write a program to print all natural numbers from 1 to n and Write a program to print all natural numbers in reverse

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for n: ");
        int n = scanner.nextInt();

        System.out.println("Natural numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nNatural numbers in reverse order:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
