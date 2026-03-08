//Q64. Create a package named com.library.bookd with a class Book containing fields title and author. Create another class in a different package that imports Books and displays its details. 

// In file: com/library/bookd/Book.java
package com.library.bookd;
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

// In file: com/library/main/Main.java
package com.library.main;
import com.library.bookd.Book;
public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Book Author: " + book.getAuthor());
    }
}
