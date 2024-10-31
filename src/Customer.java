import java.util.LinkedList;

public class Customer {
    private String name, type, password;
    private Cart cart;
    private LinkedList<Order> history;

    public Customer(String name, String password, String type) {
        this.name = name;
        this.password = password;
        this.type = type;
        cart = new Cart();
        history = new LinkedList<Order>();
    }

    public Cart getCart() {
        return cart;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
