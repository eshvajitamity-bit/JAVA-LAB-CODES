//Q1. Write a program to implement bitwise operator

public class BitwiseExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println("a = " + a + " (0101), b = " + b + " (0011)");
        
        System.out.println("a & b  = " + (a & b)); 

        System.out.println("a | b  = " + (a | b)); 

        System.out.println("a ^ b  = " + (a ^ b));

        System.out.println("~a     = " + (~a));    

        System.out.println("a << 1 = " + (a << 1)); 

        System.out.println("a >> 1 = " + (a >> 1)); 
    }
}