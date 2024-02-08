package IteratorsAndComparators.Book;

import java.util.Iterator;

public class BookIterator implements Iterator<Book> {

    private Book[] books;
    private int index = 0;

    public BookIterator(Book... books) {
        setBooks(books);
    }

    @Override
    public boolean hasNext() {
        return index < books.length;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public Book next() {
        return books[index++];
    }
}
