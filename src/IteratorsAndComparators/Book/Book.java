package IteratorsAndComparators.Book;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        setTitle(title);
        setAuthor(author);
        setYear(year);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Book that) {
        int object = that.title.compareTo(this.title);
        if (object == 0) {
            return Integer.compare(that.year, this.year);
        } else if (object < 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
