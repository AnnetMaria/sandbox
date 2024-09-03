package nl.hu.bep2.casino.shop.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<LineItem> items = new ArrayList<>();

    public List<LineItem> getItems() {
        return items;
    }

    public void setItems(List<LineItem> items) {
        this.items = items;
    }
}
