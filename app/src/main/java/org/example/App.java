/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public static void main(String[] args) {
        Library library = new Library();

        library.attachBook(new Book("Code With Me", "Moses Sea", 1890));
        library.attachBook(new Book("Discrete Math", "Blessings Yeboah", 2024));

        System.out.println("Available books in library: ");
        library.showAllBooks();

        Patron patron = new Patron("Elijah", 22143348);

        patron.extractBook(new Book("Code With Me", "Moses Sea",1890), library);

        System.out.println();
        System.out.println("Extracted books: ");
        patron.showAllExtractedBooks();

        patron.returnBook(new Book("Code With Me", "Moses Sea", 1890), library);

        System.out.println();
        System.out.println("Currently available books: ");
        library.showAllBooks();

       
   
    }

   
    }

