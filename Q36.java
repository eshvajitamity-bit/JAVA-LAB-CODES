//Q36. Program to create method that returns array

import java.util.Scanner;
public class ReturnArray {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = createArray(size);

        System.out.println("You entered the following array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] createArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }
}