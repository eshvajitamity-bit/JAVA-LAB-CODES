//Q18. Write a program to print the ASCII values     

public class ASCIITable {
    public static void main(String[] args) {
        System.out.println("ASCII values of characters from 32 to 126:");
        for (int i = 32; i <= 126; i++) {
            System.out.println(i + " : " + (char) i);
        }
    }
}