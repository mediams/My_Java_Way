package library;

import mytasks.mylibrary.Author;
import mytasks.mylibrary.Book;
import mytasks.mylibrary.Publisher;

import java.util.Arrays;

public class BookService {
    public Book[] filterBooksByAuthor(Author author, Book[] books) {
        if (author == null || books == null) {
            return new Book[0];
        }
        System.out.println(Arrays.stream(books)
                .filter(book ->
                        Arrays.stream(book.getAuthors())
                                .anyMatch(bookAuthor -> bookAuthor.equals(author)))
                .toList());
        return Arrays.stream(books)
                .filter(book -> Arrays.stream(book.getAuthors())
                        .anyMatch(bookAuthor -> bookAuthor.equals(author)))
                .toArray(Book[]::new);
    }

    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
        return Arrays.stream(books)
                .filter(book -> book.getPublisher().equals(publisher))
                .toArray(Book[]::new);
    }

    // methods keeps books with publishing year inclusively.
    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
        return Arrays.stream(books)
                .filter(book -> book.getPublishingYear() == yearFromInclusively)
                .toArray(Book[]::new);
    }

}
