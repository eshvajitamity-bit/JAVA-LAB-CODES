//Q25. Write a program to show multilevel inheritance.

class Grandparent {
    void display() {
        System.out.println("This is the grandparent class.");
    }
}

class Parent extends Grandparent {
    void show() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void print() {
        System.out.println("This is the child class.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.display(); 
        child.show();    
        child.print();  
    }
}
