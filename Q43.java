//Q43. Write a program to show usage of throw keyword. 

public class ThrowExample {
    public static void main(String[] args) {
        try {
            validateAge(15); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}
