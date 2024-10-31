import java.util.LinkedHashMap;

public class Cart {
    long total;
    LinkedHashMap<String, Integer> cnt; // frequency count of each item

    public Cart() {
        cnt = new LinkedHashMap<String, Integer>();
    }
}
