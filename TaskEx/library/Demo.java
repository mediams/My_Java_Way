package library;

import java.math.BigDecimal;

public class Demo {
    public static void main(String[] args) {
        Author authorJon = new Author(1, "Jon", "Johnson");
        Author authorWilliam = new Author(2, "William", "Wilson");
        Author authorWalter = new Author(3, "Walter", "Peterson");
        Author authorCraig = new Author(4, "Craig", "Gregory");
        Publisher publisher_1 = new Publisher(1, "Publisher_1");
        Publisher publisher_2 = new Publisher(2, "Publisher_2");
        Publisher publisher_3 = new Publisher(3, "Publisher_3");

        Book[] books = new Book[]{
                new Book(1, "Book_1", new Author[]{authorJon}, publisher_1, 1990, 231, BigDecimal.valueOf(24.99), CoverType.PAPERBACK),
                new Book(2, "Book_2", new Author[]{authorJon, authorWilliam}, publisher_2, 2000, 120, BigDecimal.valueOf(14.99), CoverType.PAPERBACK),
                new Book(3, "Book_3", new Author[]{authorWalter}, publisher_1, 1997, 350, BigDecimal.valueOf(34.99), CoverType.HARDCOVER),
                new Book(4, "Book_4", new Author[]{authorCraig}, publisher_3, 1992, 185, BigDecimal.valueOf(19.99), CoverType.PAPERBACK)};

        BookService bookService = new BookService();
        bookService.filterBooksByAuthor(authorJon, books);
        bookService.filterBooksByPublisher(publisher_1, books);
        bookService.filterBooksAfterSpecifiedYear(1992, books);
    }
}
