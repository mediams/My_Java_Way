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
@Setter
public class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();



    public void addBook(Book book) {
        books.add(book);
    }
    private void removeBook(Book book) {
        books.remove(book);
    }
    private void registerUser(User user) {
        users.add(user);
    }
    private Book findBookByIsbn(String isbn){
        for(Book book : books){
            if(book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }


}
