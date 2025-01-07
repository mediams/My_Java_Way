public class Author {
    private static int id; //unique identifier
    private String firstName; //author’s first name
    private String lastName; //author’s last name

    static{
        id++;
    }

    public Author() {
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
