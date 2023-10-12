package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Item> items;
    public List<Item> search(flower.store.filters.Filter filter) {
        List<Item> foundItems = new ArrayList<Item>();
        for (Item item: items) {
            if (filter.match(item)) {
                foundItems.add(item);
            }
        }
        return foundItems;
    }
}
