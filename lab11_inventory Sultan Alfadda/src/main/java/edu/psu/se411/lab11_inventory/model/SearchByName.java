package edu.psu.se411.lab11_inventory.model;

public class SearchByName<T> implements SearchCriteria<T> {
    private String name;

    public SearchByName(String name) {
        this.name = name;
    }

    @Override
    public boolean matches(T item) {
        if (item instanceof Book) {
            return ((Book) item).getTitle().equalsIgnoreCase(name);
        } else if (item instanceof ElectronicDevice) {
            return ((ElectronicDevice) item).getName().equalsIgnoreCase(name);
        }
        return false;
    }
}
