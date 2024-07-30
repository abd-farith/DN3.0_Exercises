// Step 1: Understanding the problem is completed in Understanding.txt
// Step 4: Analysis is completed in Analysis.txt

import java.util.Arrays;

public class MainLibrary {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book(2, "To Kill a Mockingbird", "Harper Lee"),
            new Book(3, "1984", "George Orwell"),
            new Book(4, "Pride and Prejudice", "Jane Austen"),
            new Book(5, "Moby-Dick", "Herman Melville")
        };

        Arrays.sort(books, (a, b) -> a.getTitle().compareToIgnoreCase(b.getTitle()));

        Library library = new Library(books);

        System.out.println("Linear Search for '1984':");
        Book book = library.linearSearchByTitle("1984");
        if (book != null) {
            System.out.println("Found: " + book.getTitle() + " by " + book.getAuthor());
        } else {
            System.out.println("Book not found.");
        }
        
        System.out.println("\nBinary Search for '1984':");
        book = library.binarySearchByTitle("1984");
        if (book != null) {
            System.out.println("Found: " + book.getTitle() + " by " + book.getAuthor());
        } else {
            System.out.println("Book not found.");
        }
    }
}
