public class Book {

    // TODO: make fields private
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    // TODO: Implement parameterized constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true; // default to available when a book is created
        // implement
    }

    // TODO: Implement copy constructor
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.year = other.year;
        this.isAvailable = other.isAvailable;
    }

    // TODO: Implement getters
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    // TODO: Implement borrow logic
    public void borrowBook() {
        if (this.isAvailable) {
            this.isAvailable = false;
        } else {
            System.out.println("Sorry, this book is currently unavailable.");
        }
    }

    // TODO: Implement return logic
    public void returnBook() {
        this.isAvailable = true;
    }

    // TODO: Override toString()
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", isAvailable=" + isAvailable +
                '}';
    }

    // TODO: Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return year == book.year &&
                isAvailable == book.isAvailable &&
                title.equals(book.title) &&
                author.equals(book.author);
    }
}
