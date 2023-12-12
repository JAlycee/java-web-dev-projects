package org.launchcode;
public class MenuItem {
    // Fields
    public String name;        // Name of the menu item
    public double price;       // Price of the menu item
    public String description; // Description of the menu item
    public String category;    // Category of the menu item (appetizer, main course, dessert)
    public boolean isNew;      // Whether the menu item is new

    // Constructor
    public MenuItem(String name, double price, String description, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }
}
