import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BrowseMenu {
    private Menu menu;
    private Collection<Item> items;

    public BrowseMenu(Menu menu) {
        this.menu = menu;
        this.items = menu.getItems();
    }

    public void viewItems() {
        for (Item E : items) {
            System.out.println(E);
        }
    }

    public Item search(String name) {
        for (Item E : items) {
            if (E.getName().equals(name)) {
                return E;
            }
        }
        return null;
    }

    public void filter(String category) {
        for (Item E : items) {
            if (E.getCategory().equals(category)) {
                System.out.println(E);
            }
        }
    }

    public void sort() {
        ArrayList<Item> arrayItems = new ArrayList<Item>(items);
        Collections.sort(arrayItems);
    }
}
