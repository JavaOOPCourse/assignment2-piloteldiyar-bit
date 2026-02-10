import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);

        int choice;

        do {
            System.out.println("\nLibrary Menu");
            System.out.println("1. Add book");
            System.out.println("2. Add e-book");
            System.out.println("3. Display all books");
            System.out.println("4. Search book by title");
            System.out.println("5. Borrow book");
            System.out.println("6. Return book");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {

                case 1:
                    System.out.print("Enter title: ");
                    String t1 = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String a1 = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int y1 = scanner.nextInt();
                    library.addBook(new Book(t1, a1, y1)); 
                    break;

                case 2:
                    System.out.print("Enter title: ");
                    String t2 = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String a2 = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int y2 = scanner.nextInt();
                    System.out.print("Enter file size (MB): ");
                    double fs = scanner.nextDouble();
                    library.addBook(new EBook(t2, a2, y2, fs));
                    break;

                case 4:
                    System.out.print("Enter title to search: ");
                    String st = scanner.nextLine();
                    Book found = library.searchByTitle(st); 
                    if (found != null) {
                        System.out.println("Found: " + found);
                    } else {
                        System.out.println("Not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter title to borrow: ");
                    String bt = scanner.nextLine();
                    library.borrowBook(bt);
                    break;

                case 6:
                    System.out.print("Enter title to return: ");
                    String rt = scanner.nextLine();
                    library.returnBook(rt); 
                    break;
            }

        } while (choice != 7);

        scanner.close();
    }
}
