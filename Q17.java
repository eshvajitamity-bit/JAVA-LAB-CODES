//Q17. Write a program to print all odd and even numbers seperately between 1 to 100                                                         

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Even numbers between 1 and 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nOdd numbers between 1 and 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}