package set;

import java.util.*;

public class BookEx {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(new BookData("Book 1", "Tom Smith"), true, 21.0, 29));
        books.add(new Book(new BookData("Book 2", "Tom Smith"), true, 21.0, 29));
        books.add(new Book(new BookData("Book 2", "Tom Smith 1"), false, 21.0, 29));
        books.add(new Book(new BookData("Book 1", "Tom Smith 2"), true, 12.0, 29));
        books.add(new Book(new BookData("Book 1", "Tom Smith"), false, 21.0, 8));

        Collections.sort(books);
        System.out.println(books);
    }

    public static void Comparator(Book book, Comparator<String> comparator) {

    }
}
