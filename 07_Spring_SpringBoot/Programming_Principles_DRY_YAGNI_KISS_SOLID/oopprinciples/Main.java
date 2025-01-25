package oopprinciples;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        System.out.println(lib);
        lib.addBook(new Book("New Detective", "Lermontov", "456-21", 4));
        System.out.println(lib);
        lib.removeBook(new Book("New Detective", "Lermontov", "456-21", 4));
    }




}
