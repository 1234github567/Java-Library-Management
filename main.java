import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. List Books");
            System.out.println("3. Add Member");
            System.out.println("4. List Members");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice =sc.nextInt();
            switch (choice) {
                case 1 -> library.addBook();
                case 2 -> library.listBooks();
                case 3 -> library.addMember();
                case 4 -> library.listMembers();
                case 5 -> library.borrowBook();
                case 6 -> library.returnBook();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}



