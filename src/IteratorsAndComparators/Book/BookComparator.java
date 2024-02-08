package IteratorsAndComparators.Book;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if (o1.compareTo(o2) == 0) {
            return Integer.compare(o1.getYear(), o2.getYear());
        }
        return 0;
    }
}
