package nl.hu.bep2.casino.shop.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<LineItem> items = new ArrayList<>();

    public List<LineItem> getItems() {
        return items;
    }

    public void addItem(Product product, int amount) {
        LineItem item = items.stream()
                .filter(lineItem -> lineItem.getProduct().getId() == product.getId())
                .findFirst()
                .orElse(new LineItem(product, 0));

        item.addProducts(amount);
    }

}
