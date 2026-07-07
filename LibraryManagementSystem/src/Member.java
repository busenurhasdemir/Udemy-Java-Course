import java.util.Arrays;

public class Member extends User {
    private Book[] borrowedBooks = new Book[10];
    private int borrowedCount = 0;

    public Member(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: "+ getId());
        System.out.println("Name: "+ getName());
        System.out.println("Email: "+ getEmail());
        System.out.println("Password: "+ getPassword());
    }

    public void borrowBook(Book book, Librarian librarian) {
        if (librarian.removeBook(book)) {
            if (borrowedCount >= borrowedBooks.length) {
                borrowedBooks = Arrays.copyOf(borrowedBooks, borrowedBooks.length * 2);
            }
            borrowedBooks[borrowedCount++] = book;
        }
    }

    public Book findBook (int ID, Librarian librarian){
        for (Book book : librarian.getInventory()){
            if (book.getId() == ID){
                return book;
            }
        }

        return null;
    }

    public void borrowBook(int ID, Librarian librarian){
        Book book =findBook(ID, librarian);
        if (librarian.removeBook(book)) {
            if (borrowedCount >= borrowedBooks.length) {
                borrowedBooks = Arrays.copyOf(borrowedBooks, borrowedBooks.length * 2);
            }
            borrowedBooks[borrowedCount++] = book;
        }



    }

    public void returnBook(Book book, Librarian librarian) {
        for (int i = 0; i < borrowedCount; i++) {
            if (borrowedBooks[i].equals(book)) {
                System.arraycopy(borrowedBooks, i + 1, borrowedBooks, i, borrowedCount - i - 1);
                borrowedBooks[--borrowedCount] = null;
                librarian.addBook(book);
                break;
            }
        }
    }



    public void printBorrowedBooks() {
        System.out.print("BorrowedBooks{books=");
        if (borrowedCount == 0) {
            System.out.println("}");
        } else {
            for (int i = 0; i < borrowedCount; i++) {
                System.out.print(borrowedBooks[i].toString());
            }
            System.out.println("}");
        }
    }
}