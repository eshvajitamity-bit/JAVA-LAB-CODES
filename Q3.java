//Q3.  Write a program to print a Fibonacci series upto a limit.

public class FibonacciSeries {
    public static void main(String[] args) {
        int limit = 50;
        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series up to " + limit + ": " + first + ", " + second);

        int next = first + second;
        while (next <= limit) {
            System.out.print(", " + next);
            first = second;
            second = next;
            next = first + second;
        }
    }
}