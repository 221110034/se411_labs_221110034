package edu.psu.se411.lab11_inventory;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.psu.se411.lab11_inventory.model.*;

public class App {

    static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Application is starting...");

        Inventory<Book> bookInventory = new Inventory<>();
        bookInventory.addItem(new Book(1, "Concurrency in Java", "Brian Goetz"));
        bookInventory.addItem(new Book(2, "Clean Code", "Robert Martin"));

        Inventory<ElectronicDevice> deviceInventory = new Inventory<>();
        deviceInventory.addItem(new ElectronicDevice(1, "iPhone 15", "Smartphone"));
        deviceInventory.addItem(new ElectronicDevice(2, "MacBook Air", "Laptop"));

        Book foundBook = bookInventory.findItem(new SearchByName<>("Concurrency in Java"));
        System.out.println("Found Book: " + foundBook);

        ElectronicDevice foundDevice = deviceInventory.findItem(new SearchByCategory("Laptop"));
        System.out.println("Found Device: " + foundDevice);

        System.out.println("\n--- Book Inventory ---");
        InventoryUtils.displayInventory(bookInventory);

        System.out.println("\n--- Device Inventory ---");
        InventoryUtils.displayInventory(deviceInventory);

        logger.info("Application is closing...");
    }
}
