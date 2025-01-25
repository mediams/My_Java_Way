package oopprinciples;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

      {
        books.add( new Book("Maria sleeps", "John", "123-56", 5));
        books.add( new Book("Racket up", "Smith", "148-56", 0));
        books.add( new Book("London is true", "Igor", "559-46", 3));
        users.add( new User("Vladimir", "01"));
    }


    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        if (book == null) {
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

    public  Book findBookByIsbn(String isbn) {
        return books.stream()
                .filter(book -> book.getIsbn()
                        .equals(isbn)).findFirst().orElse(null);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", users=" + users +
                '}';
    }
}
