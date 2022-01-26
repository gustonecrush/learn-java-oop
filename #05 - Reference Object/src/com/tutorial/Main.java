package com.tutorial;

class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("\nTitle\t: " + this.title);
        System.out.println("\nAuthor\t: " + this.author);
    }

}

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Killing Commandantore", "Haruki Murakami");
        book1.display();

        // menampilkan address
        String addressBook1 = Integer.toHexString(System.identityHashCode(book1));
        System.out.println("\nAddress\t: " + addressBook1);

        // assignment object
        Book book2 = book1;
        book2.display();
        String addressBook2 = Integer.toHexString(System.identityHashCode(book2));
        System.out.println("\nAddress\t: " + addressBook2);

        book1.title = "GRIT";
        book2.display();

        // we will input object to method
        function(book2);
        book1.display();
        book2.display();

    }

    public static void function(Book dataBook) {
        String addressBook = Integer.toHexString(System.identityHashCode(dataBook));
        System.out.println(addressBook);
        dataBook.author = "Angela Duckworth";
    }
}
