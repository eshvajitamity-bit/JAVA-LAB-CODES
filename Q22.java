//Q22. Write a program to show method overloading.

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Sum of 2 integers: " + sum(5, 10));
        System.out.println("Sum of 3 integers: " + sum(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + sum(5.5, 10.5));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}