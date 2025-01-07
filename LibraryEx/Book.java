import java.math.BigDecimal;

public class Book {
    private static int id = 0; //unique identifier

    private String name; //name of a book
    private Author[] authors; //array of authors
    private Publisher publisher; // book publisher
    private int publishingYear; //year of publishing
    private int amountOfPages; //amount of pages
    private BigDecimal price; //price of a book
    private CoverType coverType; //type of book binding, enum (Paperback, Hardcover)

    static {
        id++;
    }

    public Book() {
    }

    public Book(String name, Author[] authors, Publisher publisher, int publishingYear, int amountOfPages, BigDecimal price, CoverType coverType) {
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.amountOfPages = amountOfPages;
        this.price = price;
        this.coverType = coverType;
    }
}
