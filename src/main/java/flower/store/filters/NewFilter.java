package flower.store.filters;

import flower.store.Item;

public class NewFilter implements Filter {
    public boolean match(Item item) {
        return false;
    }
}
