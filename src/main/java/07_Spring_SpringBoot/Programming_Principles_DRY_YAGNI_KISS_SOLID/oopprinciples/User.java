package oopprinciples;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class User {
    public String name;
    private String userId;
    private final List<Book> borrowedBooks = new ArrayList<>();

    public void borrowBook(Book book) {
        if (book.getAvailableCopies() > 0) {
            borrowedBooks.add(book);
            book.setAvailableCopies(book.getAvailableCopies() - 1);
        }else System.out.println("Book is not available");
    }

    public void returnBook(Book book) {
        if (book == null) {
            System.out.println("Book not founded.");
            return;
        } else if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailableCopies(book.getAvailableCopies() + 1);
        }else System.out.println("Book is not borrowed.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userId);
    }

    @Override
    public String toString() {
        return String.format("User{name='%s', userId='%s', borrowedBooks=%s}",
                name, userId, borrowedBooks.isEmpty() ? "None" : borrowedBooks);
    }

}
