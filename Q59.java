//Q59. Create an interface Payment with a method pay (double amount). Implement this interface in two classes: CreditCardPayment and UPIPayment. Write a program to demonstrate runtime polymorphism.

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

public class PaymentExample {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment(); // Upcasting
        Payment payment2 = new UPIPayment(); // Upcasting

        payment1.pay(100.0); // Output: Paid 100.0 using Credit Card.
        payment2.pay(200.0); // Output: Paid 200.0 using UPI.
    }
}
