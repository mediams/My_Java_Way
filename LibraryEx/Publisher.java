public class Publisher {
    private static int id; //unique identifier
    private String publisherName; //name of a publisher

    public Publisher() {
    }

    public Publisher(String publisherName) {
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "publisherName='" + publisherName + '\'' +
                '}';
    }
}
