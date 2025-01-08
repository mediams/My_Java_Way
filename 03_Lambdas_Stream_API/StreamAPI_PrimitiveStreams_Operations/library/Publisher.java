package library;

import java.util.Objects;

public class Publisher {
    int id; // - unique identifier
    String publisherName; // - name of a publisher

    public Publisher(int id, String publisherName) {
        this.id = id;
        this.publisherName = publisherName;
    }

    public int getId() {
        return id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", publisherName='" + publisherName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        mytasks.mylibrary.Publisher publisher = (mytasks.mylibrary.Publisher) o;
        return id == publisher.id && Objects.equals(publisherName, publisher.publisherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, publisherName);
    }
}
