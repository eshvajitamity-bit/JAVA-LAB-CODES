//Q49. Write a program where a class implements two interfaces and demonstrates multiple inheritance using interfaces. 

interface InterfaceA {
    void methodA();
}

interface InterfaceB {
    void methodB();
}

public class MultipleInheritanceExample implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Method from Interface A");
    }

    @Override
    public void methodB() {
        System.out.println("Method from Interface B");
    }

    public static void main(String[] args) {
        MultipleInheritanceExample obj = new MultipleInheritanceExample();
        obj.methodA(); // Output: Method from Interface A
        obj.methodB(); // Output: Method from Interface B
    }
}
