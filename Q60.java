//Q60. Define two interfaces Printable and Scannable, each having one method. Create a class MultiFunctionPrinter that implements both interfaces and demonstrates their functionality.

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class MultiFunctionPrinter implements Printable, Scannable {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
}

public class MultiFunctionPrinterExample {
    public static void main(String[] args) {
        MultiFunctionPrinter printer = new MultiFunctionPrinter();
        printer.print(); // Output: Printing document...
        printer.scan();  // Output: Scanning document...
    }
}
