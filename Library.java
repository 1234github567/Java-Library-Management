import java.util.ArrayList;
import java.util.Scanner;
public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addBook() {
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        books.add(new Book(id, title, author));
        System.out.println("Book added successfully.");
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void addMember() {
        System.out.print("Enter Member ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        members.add(new Member(id, name));
        System.out.println("Member added successfully.");
    }

    public void listMembers() {
        for (Member m : members) {
            System.out.println(m);
        }
    }

    public void borrowBook() {
        System.out.print("Enter Book ID to borrow: ");
        int bookId = scanner.nextInt();
        Book book = findBook(bookId);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book not available.");
        }
    }

    public void returnBook() {
        System.out.print("Enter Book ID to return: ");
        int bookId = scanner.nextInt();
        Book book = findBook(bookId);
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Invalid return.");
        }
    }

    private Book findBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }
}
