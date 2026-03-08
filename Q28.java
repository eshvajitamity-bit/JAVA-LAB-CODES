//Q28. Write a program to show concept of multiple inheritance through implementation of interfaces in a class.

interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

public class MultipleInheritance implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Method from Interface A");
    }

    @Override
    public void methodB() {
        System.out.println("Method from Interface B");
    }

    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.methodA(); 
        obj.methodB(); 
    }
}
