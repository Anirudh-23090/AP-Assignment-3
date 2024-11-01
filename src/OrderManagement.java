import java.util.LinkedList;

public class OrderManagement {
    private LinkedList<Order> orders; // Pending orders

    public OrderManagement(LinkedList<Order> orders) {
        this.orders = orders;
    }

    public void viewOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public void processRefunds() {
        for (Order order : orders) {
            if (order.getStatus().equals("Cancelled")) {
                System.out.println("Refund of " + order.getTotal() + " to " + order.getCustomer().getType() + " " + order.getCustomer().getName());
            }
        }
    }

    public void setStatus(int orderID, String status) {
        for (Order order : orders) {
            if (order.getOrderID() == orderID) {
                order.setStatus(status);
                break;
            }
        }
    }
}
