package IteratorsAndComparators.Book;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("aaa", "Harper Lee", 1);
        Book book2 = new Book("bbb", "George Orwell", 2);
        Book book3 = new Book("aaa", "F. Scott Fitzgerald", 3);
//        IteratorsAndComparators.Book.Book book1 = new IteratorsAndComparators.Book.Book("To Kill a Mockingbird", "Harper Lee", 1960);
//        IteratorsAndComparators.Book.Book book2 = new IteratorsAndComparators.Book.Book("1984", "George Orwell", 1949);
//        IteratorsAndComparators.Book.Book book3 = new IteratorsAndComparators.Book.Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
//        IteratorsAndComparators.Book.Book book4 = new IteratorsAndComparators.Book.Book("One Hundred Years of Solitude", "Gabriel García Márquez", 1967);
//        IteratorsAndComparators.Book.Book book5 = new IteratorsAndComparators.Book.Book("A Passage to India", "E.M. Forster", 1924);
//        IteratorsAndComparators.Book.Book book6 = new IteratorsAndComparators.Book.Book("Invisible Man", "Ralph Ellison", 1952);
//        IteratorsAndComparators.Book.Book book7 = new IteratorsAndComparators.Book.Book("Don Quixote", "Miguel de Cervantes", 1605);
//        IteratorsAndComparators.Book.Book book8 = new IteratorsAndComparators.Book.Book("Beloved", "Toni Morrison", 1987);
//        IteratorsAndComparators.Book.Book book9 = new IteratorsAndComparators.Book.Book("Mrs. Dalloway", "Virginia Woolf", 1925);
//        IteratorsAndComparators.Book.Book book10 = new IteratorsAndComparators.Book.Book("Things Fall Apart", "Chinua Achebe", 1958);
//        IteratorsAndComparators.Book.Book book11 = new IteratorsAndComparators.Book.Book("Moby-Dick", "Herman Melville", 1851);
//        IteratorsAndComparators.Book.Book book12 = new IteratorsAndComparators.Book.Book("Ulysses", "James Joyce", 1922);
//        IteratorsAndComparators.Book.Book book13 = new IteratorsAndComparators.Book.Book("The Catcher in the Rye", "J.D. Salinger", 1951);
//        IteratorsAndComparators.Book.Book book14 = new IteratorsAndComparators.Book.Book("The Sound and the Fury", "William Faulkner", 1929);
//        IteratorsAndComparators.Book.Book book15 = new IteratorsAndComparators.Book.Book("Lolita", "Vladimir Nabokov", 1955);
//        IteratorsAndComparators.Book.Book book16 = new IteratorsAndComparators.Book.Book("War and Peace", "Leo Tolstoy", 1869);
//        IteratorsAndComparators.Book.Book book17 = new IteratorsAndComparators.Book.Book("The Brothers Karamazov", "Fyodor Dostoevsky", 1880);
//        IteratorsAndComparators.Book.Book book18 = new IteratorsAndComparators.Book.Book("Pride and Prejudice", "Jane Austen", 1813);
//        IteratorsAndComparators.Book.Book book19 = new IteratorsAndComparators.Book.Book("The IteratorsAndComparators.Book.Book Thief", "Markus Zusak", 2005);
//        IteratorsAndComparators.Book.Book book20 = new IteratorsAndComparators.Book.Book("The Hobbit", "J.R.R. Tolkien", 1937);
//        IteratorsAndComparators.Book.Book book21 = new IteratorsAndComparators.Book.Book("Little Women", "Louisa May Alcott", 1868);
//        IteratorsAndComparators.Book.Book book22 = new IteratorsAndComparators.Book.Book("Jane Eyre", "Charlotte Brontë", 1847);
//        IteratorsAndComparators.Book.Book book23 = new IteratorsAndComparators.Book.Book("Wuthering Heights", "Emily Brontë", 1847);
//        IteratorsAndComparators.Book.Book book24 = new IteratorsAndComparators.Book.Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
//        IteratorsAndComparators.Book.Book book25 = new IteratorsAndComparators.Book.Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997);
//        IteratorsAndComparators.Book.Book book26 = new IteratorsAndComparators.Book.Book("The Lion, the Witch and the Wardrobe", "C.S. Lewis", 1950);
//        IteratorsAndComparators.Book.Book book27 = new IteratorsAndComparators.Book.Book("The Catcher in the Rye", "J.D. Salinger", 1951);
//        IteratorsAndComparators.Book.Book book28 = new IteratorsAndComparators.Book.Book("To the Lighthouse", "Virginia Woolf", 1927);
//        IteratorsAndComparators.Book.Book book29 = new IteratorsAndComparators.Book.Book("The Grapes of Wrath", "John Steinbeck", 1939);
//        IteratorsAndComparators.Book.Book book30 = new IteratorsAndComparators.Book.Book("The Chronicles of Narnia", "C.S. Lewis", 1956);
//
        Library library = new Library(book1, book2, book3/*, book4, book5, book6, book7, book8, book9, book10,
                book11, book12, book13, book14, book15, book16, book17, book18, book19, book20,
                book21, book22, book23, book24, book25, book26, book27, book28, book29, book30*/);


        List<Book> bookList = Arrays.stream(library.getLibrary()).collect(Collectors.toList());
        Collections.sort(bookList);


        for (Book book : bookList) {
            System.out.println(book.getAuthor());
        }


    }
}
