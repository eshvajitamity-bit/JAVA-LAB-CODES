//Q29. Write a program to show the concept of multiple inheritance through implementation of interfaces in another interface that then gets extended in a class.

interface InterfaceA {
    void methodA();
}       

interface InterfaceB {
    void methodB();
}

interface CombinedInterface extends InterfaceA, InterfaceB {
    void methodCombined();
}

public class MultipleInheritanceWithInterface extends CombinedInterface {
    @Override
    public void methodA() {
        System.out.println("Method from Interface A");
    }

    @Override
    public void methodB() {
        System.out.println("Method from Interface B");
    }

    @Override
    public void methodCombined() {
        System.out.println("Method from Combined Interface");
    }

    public static void main(String[] args) {
        MultipleInheritanceWithInterface obj = new MultipleInheritanceWithInterface();
        obj.methodA();
        obj.methodB(); 
        obj.methodCombined(); 
    }
}
