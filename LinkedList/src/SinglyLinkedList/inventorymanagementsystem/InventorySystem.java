package SinglyLinkedList.inventorymanagementsystem;

public class InventorySystem {
    public static void main(String[] args) {
        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addItemAtEnd("Laptop", 101, 5, 50000);
        inventory.addItemAtBeginning("Mouse", 102, 10, 500);
        inventory.addItemAtEnd("Keyboard", 103, 8, 1000);

        System.out.println("Inventory list:");
        inventory.displayInventory();

        System.out.println("\nUpdating quantity of Mouse to 15:");
        inventory.updateQuantity(102, 15);
        inventory.displayInventory();

        System.out.println("\nSearching for item with ID 103:");
        inventory.searchItem(103, "");

        System.out.println("\nTotal inventory value: " + inventory.calculateTotalValue());

        System.out.println("\nRemoving Keyboard:");
        inventory.removeItem(103);
        inventory.displayInventory();
    }
}
