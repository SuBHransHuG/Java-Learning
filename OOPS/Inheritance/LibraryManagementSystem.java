import java.util.Scanner;

class Book {
    String title;
    String author;
    int ISBN;

    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}

class Library {
    int booksInLibrary = 0;

    void addBook(Book book) {
        booksInLibrary++;
        System.out.println("Adding book to library:");
        book.displayDetails();
        System.out.println("Total books in library: " + booksInLibrary);
    }

    void removeBook() {
        if (booksInLibrary > 0) {
            booksInLibrary--;
            System.out.println("Book removed from library.");
        } else {
            System.out.println("No books to remove.");
        }
        System.out.println("Total books in library: " + booksInLibrary);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        System.out.print("Enter the number of books to add: ");
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            System.out.print("Enter book title: ");
            String bookTitle = scanner.nextLine();

            System.out.print("Enter book author: ");
            String bookAuthor = scanner.nextLine();

            System.out.print("Enter ISBN number: ");
            int ISBN = scanner.nextInt();
            scanner.nextLine();

            Book book = new Book(bookTitle, bookAuthor, ISBN);
            library.addBook(book);

            t--;
        }

        System.out.println("Removing a book from the library...");
        library.removeBook();
    }
}
