package IteratorsAndComparators.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Book  implements Comparable<Book>{
    private String title;
    private int year;
    private List<String> authors;

    public Book (String title, int year, String... authors) {
        this.title = title;
        this.year = year;
        this.authors = new ArrayList<>(Arrays.asList(authors));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @Override
    public int compareTo(Book o) {
        if (getTitle().compareTo(o.getTitle()) == 0) {

        }
        return getTitle().compareTo(o.getTitle());
    }
}