// Library Management system
class Library1 {
    private String[] books;           // Made private for encapsulation
    private int noOfBooks;            // Tracks available books
    private String[] issuedBooks;     // New: Tracks issued books
    private int noOfIssuedBooks;      // New: Tracks number of issued books
    private static final int MAX_BOOKS = 100; // Constant for max capacity

    // Constructor
    Library1() {
        this.books = new String[MAX_BOOKS];
        this.issuedBooks = new String[MAX_BOOKS];
        this.noOfBooks = 0;
        this.noOfIssuedBooks = 0;
    }

    // Add a book to the library
    public void addBook(String book) {
        if (noOfBooks >= MAX_BOOKS) {
            System.out.println("Library is full! Cannot add " + book);
            return;
        }
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.format("📖 '%s' has been added to the library.\n", book);
    }

    // Show all available books
    public void showAvailableBooks() {
        if (noOfBooks == 0) {
            System.out.println("⚠️ No books available in the library.");
            return;
        }
        System.out.println("\n📚 Available Books:");
        for (int i = 0; i < noOfBooks; i++) {
            System.out.println("  " + (i + 1) + ". " + books[i]);
        }
    }

    // Issue a book
    public void issueBook(String issueBook) {
        for (int i = 0; i < noOfBooks; i++) { // Fixed: Loop only up to noOfBooks
            if (this.books[i].equals(issueBook)) {
                System.out.format("✅ '%s' has been issued!\n", issueBook);
                // Move to issuedBooks
                issuedBooks[noOfIssuedBooks] = books[i];
                noOfIssuedBooks++;
                // Shift books array to remove the issued book
                for (int j = i; j < noOfBooks - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[noOfBooks - 1] = null;
                noOfBooks--;
                return;
            }
        }
        System.out.format("❌ '%s' does not exist in the library!\n", issueBook);
    }

    // Return a book
    public void returnBook(String book) {
        // Check if the book was issued
        for (int i = 0; i < noOfIssuedBooks; i++) {
            if (issuedBooks[i].equals(book)) {
                System.out.format("🔙 '%s' has been returned to the library.\n", book);
                addBook(book); // Add it back to available books
                // Remove from issuedBooks
                for (int j = i; j < noOfIssuedBooks - 1; j++) {
                    issuedBooks[j] = issuedBooks[j + 1];
                }
                issuedBooks[noOfIssuedBooks - 1] = null;
                noOfIssuedBooks--;
                return;
            }
        }
        System.out.format("⚠️ '%s' was not issued from this library.\n", book);
    }

    // New: Show issued books
    public void showIssuedBooks() {
        if (noOfIssuedBooks == 0) {
            System.out.println("⚠️ No books are currently issued.");
            return;
        }
        System.out.println("\n📕 Issued Books:");
        for (int i = 0; i < noOfIssuedBooks; i++) {
            System.out.println("  " + (i + 1) + ". " + issuedBooks[i]);
        }
    }

    // New: Check library status
    public void showLibraryStatus() {
        System.out.println("\n🏛️ Library Status:");
        System.out.format("  Total Available Books: %d\n", noOfBooks);
        System.out.format("  Total Issued Books: %d\n", noOfIssuedBooks);
        System.out.format("  Remaining Capacity: %d\n", MAX_BOOKS - (noOfBooks + noOfIssuedBooks));
    }
}

public class JavaCWH27 {
    public static void main(String[] args) {
        Library1 centralLibrary = new Library1();

        // Adding books
        System.out.println("=== Adding Books ===");
        centralLibrary.addBook("Think and Grow Rich");
        centralLibrary.addBook("The Secret");
        centralLibrary.addBook("Life is What You Make It");
        centralLibrary.addBook("Who Moved My Cheese");

        // Show available books
        centralLibrary.showAvailableBooks();

        // Issue a book
        System.out.println("\n=== Issuing a Book ===");
        centralLibrary.issueBook("Mindset"); // Should fail
        centralLibrary.issueBook("The Secret"); // Should succeed
        centralLibrary.showAvailableBooks();
        centralLibrary.showIssuedBooks();

        // Return a book
        System.out.println("\n=== Returning a Book ===");
        centralLibrary.returnBook("Mindset"); // Should fail
        centralLibrary.returnBook("The Secret"); // Should succeed
        centralLibrary.showAvailableBooks();
        centralLibrary.showIssuedBooks();

        // Show library status
        centralLibrary.showLibraryStatus();
    }
}