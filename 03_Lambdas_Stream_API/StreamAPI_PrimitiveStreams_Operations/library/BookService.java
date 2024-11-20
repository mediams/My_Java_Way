package library;

import java.util.Arrays;
import java.util.Comparator;

public class BookService {
    public Book[] filterBooksByAuthor(Author author, Book[] books) {
        if (author == null || books == null) {
            return new Book[0];
        }
        return Arrays.stream(books)
                .filter(book -> book.getAuthors().equals(author))
                .toArray(Book[]::new);
    }

//    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
//	<write your code here>
//    }
//
//    // methods keeps books with publishing year inclusively.
//    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
//	<write your code here>
//    }

}
