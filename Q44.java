//Q44. Write a program to show nested try blocks. 

public class NestedTryExample {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[5]); // This will throw ArrayIndexOutOfBoundsException

            try {
                int result = 10 / 0; // This will throw ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Caught an ArithmeticException: " + e.getMessage());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
