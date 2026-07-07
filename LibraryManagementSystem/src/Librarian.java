import java.util.Arrays;

    public class Librarian extends User {
        private Book[] inventory = new Book[10];
        private int inventoryCount = 0;

        public Book[] getInventory() {
            return inventory;
        }

        public Librarian(int id, String name, String email, String password) {
            super(id, name, email, password);
        }

        @Override
        public void displayInfo() {
            System.out.println("Name: "+ getName());
            System.out.println("Email: "+ getEmail());
            System.out.println("Password: "+ getPassword());
        }

        public void addBook(Book book) {
            if (inventoryCount >= inventory.length) {
                inventory = Arrays.copyOf(inventory, inventory.length * 2);
            }
            inventory[inventoryCount++] = book;
        }

        public boolean removeBook(Book book) {
            for (int i = 0; i < inventoryCount; i++) {
                if (inventory[i].equals(book)) {
                    System.arraycopy(inventory, i + 1, inventory, i, inventoryCount - i - 1);
                    inventory[--inventoryCount] = null;
                    return true;
                }
            }
            return false;
        }

        public void printInventory() {
            System.out.println("Library Inventory:");
            if (inventoryCount == 0) {
                System.out.println("(no books available)");
            } else {
                for (int i = 0; i < inventoryCount; i++) {
                    System.out.println(inventory[i]);
                }
            }
        }
    }