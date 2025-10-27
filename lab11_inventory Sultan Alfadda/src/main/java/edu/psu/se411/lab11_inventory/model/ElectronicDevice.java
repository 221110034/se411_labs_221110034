package edu.psu.se411.lab11_inventory.model;

public class ElectronicDevice {
    private int id;
    private String name;
    private String category;

    public ElectronicDevice(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return "ElectronicDevice [id=" + id + ", name=" + name + ", category=" + category + "]";
    }
}