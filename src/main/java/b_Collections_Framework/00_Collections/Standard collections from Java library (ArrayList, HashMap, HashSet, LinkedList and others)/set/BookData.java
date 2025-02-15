package set;

public class BookData implements Comparable<BookData> {
    private String title;
    private String author;

    public BookData(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "BookData{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int compareTo(BookData o) {
        int result = this.title.compareTo(o.title);
        if (result != 0) {
            return result;
        }
        return this.author.compareTo(o.author);
    }
}
