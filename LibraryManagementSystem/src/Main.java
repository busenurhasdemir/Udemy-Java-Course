public class Main {
    public static void main(String[] args) {
        Member m1 = new Member(1, "Alice Brown", "alice@example.com", "member123");
        Member m2 = new Member(2, "Bob White", "bob@example.com", "member456");
        Librarian lib = new Librarian(3, "Mr. Green", "green@example.com", "lib789");

        Book b1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald");
        Book b2 = new Book(2, "1984", "George Orwell");

        lib.addBook(b1);
        lib.addBook(b2);

        System.out.println(m1);
        m1.printBorrowedBooks();
        System.out.println(m2);
        m2.printBorrowedBooks();
        System.out.println(lib);
        lib.printInventory();

        System.out.println("\nAfter borrowing books:");
        m1.borrowBook(b1, lib);
        m2.borrowBook(b2, lib);

        System.out.println(m1);
        m1.printBorrowedBooks();
        System.out.println(m2);
        m2.printBorrowedBooks();
        System.out.println(lib);
        lib.printInventory();

        System.out.println("\nAfter returning a book:");
        m1.returnBook(b1, lib);

        System.out.println(m1);
        m1.printBorrowedBooks();
        lib.printInventory();
    }
}