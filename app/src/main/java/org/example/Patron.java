package org.example;

import java.util.ArrayList;


public class Patron {
    private final String name;
    private final ArrayList<Book> extracteddBooks;

    public Patron(String name, int ID) {
        this.name = name;
        extracteddBooks = new ArrayList<>();
    }

    public void extractBook(Book book, Library library) {
        if (library.extractBook(book.title())) {
            extracteddBooks.add(book);
            System.out.println(name + " borrowed " + book.title());
        } else {
            System.out.println("Requested book not found");
        }
    }
    
    public void returnBook(Book book, Library library) {
        if (extracteddBooks.remove(book)) {
            library.attachBook(book);
            System.out.println(name + " returned " + book.title());
        } else {
            System.out.print("Book not returned yet");
        }
    }

    public void showAllExtractedBooks() {
        if (extracteddBooks.isEmpty()) {
            System.out.println("Books intact");
        } else {
            for (Book book : extracteddBooks) {
                System.out.println(book.title());
            }
        }
    }
}
