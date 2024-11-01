public class Order {
    private int date, orderID;
    private long total;
    private Cart cart;
    private Customer customer;
    private String name, status, request, details;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public Cart getCart() {
        return cart;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getOrderID() {
        return orderID;
    }

    public int getDate() {
        return date;
    }

    public long getTotal() {
        return total;
    }

    public String getDetails() {
        return details;
    }

    public String getRequest() {
        return request;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderID " + orderID + " Date " + date + " Customer " + customer.getType() + " " + customer.getName() + "\n" + cart;
    }
}
