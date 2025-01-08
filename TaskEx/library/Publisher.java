package library;

public class Publisher {
    private int id; //unique identifier
    private String publisherName; //name of a publisher

    public Publisher() {
    }

    public Publisher(String publisherName) {
        this.publisherName = publisherName;
    }

    public Publisher(int id, String publisherName) {
        this.id = id;
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "publisherName='" + publisherName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getPublisherName() {
        return publisherName;
    }
}
