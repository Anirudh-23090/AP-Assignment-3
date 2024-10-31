import java.util.LinkedList;

public class Customer {
    private String name, type;
    private Cart cart;
    private LinkedList<Order> history;

    public Customer() {
        cart = new Cart();
        history = new LinkedList<Order>();
    }

    public Cart getCart() {
        return cart;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
}
