package set;

import java.util.Comparator;

public class Book implements Comparable<Book> {
    private BookData bookData;
    private boolean isOnSale;
    private double price;
    private int count;

    public Book(BookData bookData, boolean isOnSale, double price, int count) {
        this.bookData = bookData;
        this.isOnSale = isOnSale;
        this.price = price;
        this.count = count;
    }

    public Book(BookData bookData) {
        this.bookData = bookData;
    }

    public boolean isOnSale() {
        return isOnSale;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "bookData=" + bookData +
                ", isOnSale=" + isOnSale +
                ", price=" + price +
                ", count=" + count +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.bookData.compareTo(o.bookData);
    }

    public static class BookComparatorByPrice implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return Double.compare(o1.getPrice(), o2.getPrice());
        }
    }
}
