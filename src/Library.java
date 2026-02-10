public class Library {
    private Book[] books; 
    private int count = 0;

    public Library(int capacity) {
        books = new Book[capacity]; 
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book; 
            count++;
        } else {
            System.out.println("Library is full!");
        }
    }

    public void displayBooks() {
        if (count == 0) {
            System.out.println("Library is empty.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]); 
        }
    }

    public Book searchByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i]; 
            }
        }
        return null; 
    }

    public void borrowBook(String title) {
        Book found = searchByTitle(title);
        if (found != null) {
            found.borrowBook(); 
        } else {
            System.out.println("Book not found!");
        }
    }

    public void returnBook(String title) {
        Book found = searchByTitle(title);
        if (found != null) {
            found.returnBook();
        } else {
            System.out.println("Book not found!");
        }
    }
}