//Q16. Write a program to print all alphabets from a to z and  Write a program to print reverse alphabets from Z to A

public class Alphabets {
    public static void main(String[] args) {
        System.out.println("Alphabets from a to z:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println("\n\nAlphabets from Z to A:");
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }
    }
}