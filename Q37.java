//Q37.WAP to create ArrayList. Also add, remove, change and clear the elements of ArrayList

import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("ArrayList after adding elements: " + list);

        // Removing an element
        list.remove("Banana");
        System.out.println("ArrayList after removing 'Banana': " + list);

        // Changing an element
        list.set(0, "Apricot");
        System.out.println("ArrayList after changing 'Apple' to 'Apricot': " + list);

        // Clearing the ArrayList
        list.clear();
        System.out.println("ArrayList after clearing: " + list);
    }
}
