//Q26. Write a program to show hierarchical inheritance.

class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child1 extends Parent {
    void show() {
        System.out.println("This is the first child class.");
    }
}

class Child2 extends Parent {
    void print() {
        System.out.println("This is the second child class.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();

        child1.display(); 
        child1.show();    

        child2.display();
        child2.print();  
    }
}
