package oopprinciples;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        User user = new User("Petr", "Petrov");
        System.out.println(lib);
        lib.addBook(new Book("New Detective", "Lermontov", "456-21", 4));
        System.out.println(lib);
        lib.removeBook(new Book("New Detective", "Lermontov", "456-21", 4));
        System.out.println(lib);
        System.out.println(lib.findBookByIsbn("123-56"));
        System.out.println(lib);

        lib.registerUser(user);
        System.out.println(lib);
    }
}
