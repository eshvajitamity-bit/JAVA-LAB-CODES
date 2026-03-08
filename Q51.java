//Q51. Write a Java program to show how an interface reference can refer to an object of its implementing class. 

interface MyInterface {
    void display();
}

class MyClass implements MyInterface {
    @Override
    public void display() {
        System.out.println("This is the implementation of the interface method.");
    }
}

public class InterfaceReferenceExample {
    public static void main(String[] args) {
        MyInterface myInterfaceRef = new MyClass(); // Interface reference referring to an object of the implementing class
        myInterfaceRef.display(); // Output: This is the implementation of the interface method.
    }
}
