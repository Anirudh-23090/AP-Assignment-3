public class Item {
    private String name, category, status;
    private int price;

    public Item(String name, String category, String status) {
        this.name = name;
        this.category = category;
        this.status = status;
    }

    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return ("Name " + name + ", Category " + category + ", Price" + price + ", Status " + status);
    }
}
