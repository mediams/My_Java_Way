package library;

import java.util.Objects;

public class Author {
    int id; // - unique identifier
    String firstName; // - author’s first name
    String lastName; // - author’s last name

    public Author(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        mytasks.mylibrary.Author author = (mytasks.mylibrary.Author) o;
//        return id == author.id && Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, firstName, lastName);
//    }
}
