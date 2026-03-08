//Q31. Write a program in Java to use final methods

class Parent {
    final void display() {
        System.out.println("This is a final method in the parent class.");
    }
}   

public class FinalMethodExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
