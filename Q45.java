//Q45. Write a program to show usage of throws keyword. 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ThrowsExample {
    public static void main(String[] args) {
        try {
            readFile("nonexistentfile.txt"); // This will throw IOException
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        }
    }

    public static void readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
