package oopprinciples;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Library {
    private final static List<Book> books = new ArrayList<>();
    private final static List<User> users = new ArrayList<>();

    static {
        books.add(1, new Book("Maria sleeps", "John", "123-56", 5));
        books.add(2, new Book("Racket up", "Smith", "148-56", 0));
        books.add(3, new Book("London is true", "Igor", "559-46", 3));

        users.add(1, new User("Vladimir", "01"));
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        if(book == null) {
            System.out.println("Book not founded.");
            return;
        } else {
            books.remove(book);
            System.out.println("Book removed.");
        }
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public static Book findBookByIsbn(String isbn){
        return books.stream()
                .filter(book -> book.getIsbn()
                        .equals(isbn)).findFirst().orElse(null);
    }
}
