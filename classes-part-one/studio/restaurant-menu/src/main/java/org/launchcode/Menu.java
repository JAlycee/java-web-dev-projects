// Import necessary classes
package org.launchcode;
import java.util.Date;
import java.util.ArrayList;

// Define the Menu class
public class Menu {
    // Fields
    private Date lastUpdated;        // Stores the last update date
    private ArrayList<MenuItem> menuItems; // Stores a list of menu items

    // Constructor
    public Menu() {
        this.menuItems = new ArrayList<>(); // Initialize the menuItems list
        this.lastUpdated = new Date();      // Initialize lastUpdated with the current date and time
    }

    // Method to add a menu item to the menu
    public void addItem(MenuItem item) {
        menuItems.add(item);   // Add the provided menu item to the list
        lastUpdated = new Date(); // Update lastUpdated with the current date and time
    }

    // Method to remove a menu item from the menu
    public void removeItem(MenuItem item) {
        menuItems.remove(item);  // Remove the provided menu item from the list
        lastUpdated = new Date(); // Update lastUpdated with the current date and time
    }

    // Getter method to retrieve the last update date
    public Date getLastUpdated() {
        return lastUpdated; // Return the last update date
    }

    // Getter method to retrieve the list of menu items
    public ArrayList getMenuItems() {
        return menuItems; // Return the list of menu items
    }
}
