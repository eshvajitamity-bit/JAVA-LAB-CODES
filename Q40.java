//Q40. Write a program to show ArrayIndexOutOfBoundsException.

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        try {
            System.out.println(array[10]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds. " + e.getMessage());
        }
    }
}
