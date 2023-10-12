package flower.store.Filters;

import flower.store.Item;

public interface Filter {
    boolean match(Item item);
}
