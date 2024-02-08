public class Library {

    Book[] library;

    public Library(Book... books) {
        setLibrary(books);
    }

    public Book[] getLibrary() {
        return library;
    }

    public void setLibrary(Book[] books) {
        this.library = books;
    }

}
