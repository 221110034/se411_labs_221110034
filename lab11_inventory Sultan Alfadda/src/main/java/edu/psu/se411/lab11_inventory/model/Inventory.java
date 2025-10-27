package edu.psu.se411.lab11_inventory.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public List<T> getItems() {
        return items;
    }

    public T findItem(SearchCriteria<T> criteria) {
        for (T item : items) {
            if (criteria.matches(item)) {
                return item;
            }
        }
        return null;
    }
}
