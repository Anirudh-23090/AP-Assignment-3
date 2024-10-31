import java.util.HashMap;

public class Menu {
    private HashMap<String, Item> items;

    public Menu() {
        items = new HashMap<>();
    }

    public Item get(String name) {
        return items.get(name);
    }

    public void add(Item E) {
        items.put(E.getName(), E);
    }
}
