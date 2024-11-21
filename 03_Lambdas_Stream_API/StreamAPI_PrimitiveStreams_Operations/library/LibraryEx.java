package library;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LibraryEx {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book(1, "Book_1", new Author[]
                        {new Author(1, "Jon", "Johnson")},
                        new Publisher(1, "Publisher_1"), 1990, 231, BigDecimal.valueOf(24.99), CoverType.PAPERBACK),
                new Book(2, "Book_2", new Author[]
                        {new Author(1, "Jon", "Johnson"), new Author(2, "William", "Wilson")},
                        new Publisher(2, "Publisher_2"), 2000, 120, BigDecimal.valueOf(14.99), CoverType.PAPERBACK),
                new Book(3, "Book_3", new Author[]
                        {new Author(3, "Walter", "Peterson")},
                        new Publisher(1, "Publisher_1"), 1997, 350, BigDecimal.valueOf(34.99), CoverType.HARDCOVER),
                new Book(4, "Book_4", new Author[]
                        {new Author(4, "Craig", "Gregory")},
                        new Publisher(3, "Publisher_3"), 1992, 185, BigDecimal.valueOf(19.99), CoverType.PAPERBACK)};

        Author targetAuthor = new Author(1, "Jon", "Johnson");

        BookService bookService = new BookService();

        Book[] resultBooks = bookService.filterBooksByAuthor(targetAuthor, books);
        Arrays.stream(resultBooks).forEach(System.out::println);

        System.out.println("new Publisher(1, \"Publisher_1\")");
        Publisher targetPublisher = new Publisher(1, "Publisher_1");
        Arrays.stream(bookService.filterBooksByPublisher(targetPublisher, books)).forEach(System.out::println);

    }

}
