package oopprinciples;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class LibraryManager {
    private Library library;

    public void borrowBook(String isbn, User user) {
        Book book = library.findBookByIsbn(isbn);
        if (book != null) {
            user.borrowBook(book);
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    public void returnBook(String isbn, User user){
        Book book = library.findBookByIsbn(isbn);
        if (book != null) {
            user.returnBook(book);
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }

    }
    public void addBook(Book book) {
        library.addBook(book);

    }

    public void removeBook(Book book) {
        library.removeBook(book);

    }

    public void registerUser(User user){
        library.registerUser(user);

    }

    @Override
    public String toString() {
        return "LibraryManager{" +
                "library=" + library +
                '}';
    }
}
