//Q52. Write a program using an interface to achieve runtime polymorphism.

interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphismWithInterface {
    public static void main(String[] args) {
        Animal myAnimal1 = new Dog(); // Upcasting
        Animal myAnimal2 = new Cat(); // Upcasting

        myAnimal1.sound(); // Output: Dog barks (runtime polymorphism)
        myAnimal2.sound(); // Output: Cat meows (runtime polymorphism)
    }
}
