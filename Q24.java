//Q24. Write a program to show single level inheritance.

class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the child class.");
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        child.show();    
    }
}
