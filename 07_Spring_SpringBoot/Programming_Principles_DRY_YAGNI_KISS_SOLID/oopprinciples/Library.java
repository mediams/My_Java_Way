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
    private final List<Book> books = new ArrayList<>();
    private final List<User> users = new ArrayList<>();

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

    private Book findBookByIsbn(String isbn){
        return books.stream()
                .filter(book -> book.getIsbn()
                        .equals(isbn)).findFirst().orElse(null);
    }
}
