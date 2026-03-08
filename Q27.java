//Q27. Write a program to show hybrid inheritance.

class A {
    void methodA() {
        System.out.println("Method of class A");
    }
}

class B extends A {
    void methodB() {
        System.out.println("Method of class B");
    }

class C extends A {
    void methodC() {    
        System.out.println("Method of class C");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        B objB = new B();
        C objC = new C();

        objB.methodA(); 
        objB.methodB(); 

        objC.methodA(); 
        objC.methodC(); 
    }
}
