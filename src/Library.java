
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Member> members;

    // Constructor
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // Add a book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Add a member
    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added successfully!");
    }

    // Display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }

        System.out.println("\n===== ALL BOOKS =====");

        for (Book book : books) {
            book.displayBook();
        }
    }

    // Search for a book by ID
    public void searchBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                System.out.println("\nBook found!");
                book.displayBook();
                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Issue a book
    public void issueBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {

                if (book.isIssued()) {
                    System.out.println("This book is already issued.");
                } else {
                    book.issueBook();
                    System.out.println("Book issued successfully!");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Return a book
    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {

                if (!book.isIssued()) {
                    System.out.println("This book is already available.");
                } else {
                    book.returnBook();
                    System.out.println("Book returned successfully!");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Remove a book
    public void removeBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {

                if (book.isIssued()) {
                    System.out.println("Cannot remove an issued book.");
                    return;
                }

                books.remove(book);
                System.out.println("Book removed successfully!");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Display all members
    public void displayMembers() {
        if (members.isEmpty()) {
            System.out.println("No members registered.");
            return;
        }

        System.out.println("\n===== ALL MEMBERS =====");

        for (Member member : members) {
            member.displayMember();
        }
    }

    // Display only issued books
    public void displayIssuedBooks() {
        boolean found = false;

        System.out.println("\n===== ISSUED BOOKS =====");

        for (Book book : books) {
            if (book.isIssued()) {
                book.displayBook();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books are currently issued.");
        }
    }
}
