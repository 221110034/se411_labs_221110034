package edu.psu.se411.lab11_inventory.model;

public class InventoryUtils {
    public static void displayInventory(Inventory<?> inventory) {
        for (Object item : inventory.getItems()) {
            System.out.println(item);
        }
    }
}
