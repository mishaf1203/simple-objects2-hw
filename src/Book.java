public class Book {
    private final String name;
    private int year;
    private final Author author;
    private Object id;

    public Book(String name, int year, Author author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return getName() + " "+ author.getName()+ " " + author.getSurname();
    }
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book1 = (Book) other;
        return id.equals(book1.id);


    }

}
