import java.util.LinkedHashMap;
import java.util.Map;

public class Cart {
    private long total;
    private LinkedHashMap<String, Integer> cnt; // frequency count of each item

    public Cart() {
        cnt = new LinkedHashMap<String, Integer>();
    }

    public boolean contains(String name) {
        return cnt.get(name) > 0;
    }

    public void add(String name, int quantity) {
        cnt.put(name, quantity);
    }

    public void modify(String name, int quantity) {
        cnt.put(name, quantity);
    }

    public void remove(String name) {
        cnt.remove(name);
    }

    public long getTotal() {
        return total;
    }

    @Override
    public String toString() {
        StringBuilder cart = new StringBuilder("Total " + total + "\n");
        for (Map.Entry<String, Integer> entry : cnt.entrySet()) {
            cart.append("Name ").append(entry.getKey()).append(" Count ").append(entry.getValue()).append("\n");
        }
        return cart.toString();
    }
}
