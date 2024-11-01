import java.util.LinkedList;

public class MenuManagement {
    private Menu menu;
    private LinkedList<Order> orders; // Pending orders

    public MenuManagement(Menu menu, LinkedList<Order> orders) {
        this.menu = menu;
        this.orders = orders;
    }

    public void add(String name, String category) {
        Item E = new Item(name, category, "Available");
        menu.add(E);
    }

    public void update(String name, String status) {
        // code to update status of item e
        Item E = menu.get(name);
        E.setStatus(status);
    }

    public void update(String name, int price) {
        // code to update price of item e
        Item E = menu.get(name);
        E.setPrice(price);
    }

    public void remove(String name) {
        // code to remove item e
        menu.remove(name);
        // change status of the 'pending' orders with this item as 'denied'
        for (Order order : orders) {
            if (order.getCart().contains(name)) {
                order.setStatus("Denied");
            }
        }
    }
}
