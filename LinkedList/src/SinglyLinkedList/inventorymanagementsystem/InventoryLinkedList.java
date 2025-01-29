package SinglyLinkedList.inventorymanagementsystem;

 class InventoryLinkedList {


        private ItemNode head;

        public InventoryLinkedList() {
            head = null;
        }

        // Add item at the beginning
        public void addItemAtBeginning(String itemName, int itemId, int quantity, double price) {
            ItemNode newNode = new ItemNode(itemName, itemId, quantity, price);
            newNode.next = head;
            head = newNode;
        }

        // Add item at the end
        public void addItemAtEnd(String itemName, int itemId, int quantity, double price) {
            ItemNode newNode = new ItemNode(itemName, itemId, quantity, price);
            if (head == null) {
                head = newNode;
            } else {
                ItemNode temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        // Remove item by ID
        public void removeItem(int itemId) {
            if (head == null) return;
            if (head.itemId == itemId) {
                head = head.next;
                return;
            }
            ItemNode temp = head;
            while (temp.next != null && temp.next.itemId != itemId) {
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
        }

        // Update item quantity
        public void updateQuantity(int itemId, int newQuantity) {
            ItemNode temp = head;
            while (temp != null) {
                if (temp.itemId == itemId) {
                    temp.quantity = newQuantity;
                    return;
                }
                temp = temp.next;
            }
        }

        // Search item by ID or Name
        public void searchItem(int itemId, String itemName) {
            ItemNode temp = head;
            while (temp != null) {
                if (temp.itemId == itemId || temp.itemName.equalsIgnoreCase(itemName)) {
                    System.out.println(temp.itemId + " | " + temp.itemName + " | " + temp.quantity + " | " + temp.price);
                }
                temp = temp.next;
            }
        }

        // Calculate total inventory value
        public double calculateTotalValue() {
            double totalValue = 0;
            ItemNode temp = head;
            while (temp != null) {
                totalValue += temp.price * temp.quantity;
                temp = temp.next;
            }
            return totalValue;
        }

        // Display all items
        public void displayInventory() {
            ItemNode temp = head;
            while (temp != null) {
                System.out.println(temp.itemId + " | " + temp.itemName + " | " + temp.quantity + " | " + temp.price);
                temp = temp.next;
            }
        }
    }
