public class Item implements Comparable<Item> {
    private String name, category, status, review;
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

    public String getStatus() {
        return status;
    }

    public String getReview() {
        return review;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Item E) {
        return price - E.price;
    }

    @Override
    public String toString() {
        return ("Name " + name + ", Category " + category + ", Price" + price + ", Status " + status);
    }
}
