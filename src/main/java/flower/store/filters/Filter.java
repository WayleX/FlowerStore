package flower.store.filters;

import flower.store.Item;

public interface Filter {
    boolean match(Item item);
}
