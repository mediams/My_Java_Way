package set;

import java.util.*;

public class BookEx {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(new BookData("Book 1", "Tom Smith"), true, 21.0, 29));
        books.add(new Book(new BookData("Book 2", "Tom Smith"), true, 11.0, 29));
        books.add(new Book(new BookData("Book 2", "Tom Smith 1"), false, 21.0, 29));
        books.add(new Book(new BookData("Book 1", "Tom Smith 2"), true, 12.0, 29));
        books.add(new Book(new BookData("Book 1", "Tom Smith"), false, 21.0, 8));

        Collections.sort(books); //TimSort  O(n log n).
        sortComparator(books, new Book.BookComparatorByPrice()); //O(n^2)
        System.out.println(books);
    }

    public static void sortComparator(List<Book> books, Comparator<Book> comparator) {//O(n^2)
        Book temp = null;
        for (int i = 0; i < books.size(); i++) {
            boolean isSort = true;
            for (int j = 0; j < books.size() - i - 1; j++) {
                if (comparator.compare(books.get(j), books.get(j + 1)) > 0) {
                    temp = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, temp);
                    isSort = false;
                }
            }
            if (isSort) break;
        }
    }
}
