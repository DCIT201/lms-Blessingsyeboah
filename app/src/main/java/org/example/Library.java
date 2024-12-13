package org.example;

import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }
    public void attachBook(Book book) {

        books.add(book);

        System.out.println("Book successfully attached: " + book.title());
    }
    
    
    
     
    public void showAllBooks() {

        if (books.isEmpty()) {
            System.out.println("Sorry! no books available");

         } else {
            for(Book book : books) {
                System.out.println(book.title());
            }
         }
    }
   public boolean extractBook(String title) {
    for (Book book : books) {
        if (book.title().equals(title)) {
            books.remove(book);
            return true;
        }
    }
    return false;
   }
}

 



