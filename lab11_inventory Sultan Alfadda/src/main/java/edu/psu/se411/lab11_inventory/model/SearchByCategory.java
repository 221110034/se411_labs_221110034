package edu.psu.se411.lab11_inventory.model;

public class SearchByCategory implements SearchCriteria<ElectronicDevice> {
    private String category;

    public SearchByCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean matches(ElectronicDevice item) {
        return item.getCategory().equalsIgnoreCase(category);
    }
}
