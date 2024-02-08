package IteratorsAndComparators.Book;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("1", 2000);
        Book b2 = new Book("1", 2002);

        BookComparator bookComparator = new BookComparator();

        System.out.println(bookComparator.compare(b1, b2));
    }

}