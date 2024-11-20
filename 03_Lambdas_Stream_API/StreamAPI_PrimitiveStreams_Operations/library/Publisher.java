package library;

public class Publisher {
    int id; // - unique identifier
    String publisherName; // - name of a publisher

    public Publisher(int id, String publisherName) {
        this.id = id;
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", publisherName='" + publisherName + '\'' +
                '}';
    }
}
