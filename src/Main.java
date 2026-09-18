
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        int choice;

        System.out.println("======================================");
        System.out.println("      LIBRARY MANAGEMENT SYSTEM");
        System.out.println("======================================");

        do {
            System.out.println("\n----------- MENU -----------");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Display All Books");
            System.out.println("4. Search Book");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Remove Book");
            System.out.println("8. Display All Members");
            System.out.println("9. Display Issued Books");
            System.out.println("10. Exit");
            System.out.println("----------------------------");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = scanner.nextLine();

                    Book book = new Book(bookId, title, author);
                    library.addBook(book);
                    break;

                case 2:
                    System.out.print("Enter Member ID: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Member Name: ");
                    String name = scanner.nextLine();

                    Member member = new Member(memberId, name);
                    library.addMember(member);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    System.out.print("Enter Book ID to search: ");
                    int searchId = scanner.nextInt();

                    library.searchBook(searchId);
                    break;

                case 5:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = scanner.nextInt();

                    library.issueBook(issueId);
                    break;

                case 6:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = scanner.nextInt();

                    library.returnBook(returnId);
                    break;

                case 7:
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = scanner.nextInt();

                    library.removeBook(removeId);
                    break;

                case 8:
                    library.displayMembers();
                    break;

                case 9:
                    library.displayIssuedBooks();
                    break;

                case 10:
                    System.out.println("\nThank you for using the Library Management System!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 10);

        scanner.close();
    }
}
