//Q32. Write a program in Java to use final classes

final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

public class FinalClassExample {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.display(); 
    }
}
