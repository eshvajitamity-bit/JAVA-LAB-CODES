//Q46. Write a program to show runtime polymorphism/upcasting 

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.sound(); // Output: Dog barks (runtime polymorphism)
    }
}
