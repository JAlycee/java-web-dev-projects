package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for radius
        System.out.print("Enter a radius: ");

        // Read the radius as a double
        double radius = scanner.nextDouble();

        // Calculate the Area
        double area = calculateArea(radius);

        // Output the result
        System.out.println("The area of a circle of radius " + radius + " is: " + area);

    }
    // Method to calculate the area of the circle
    private static double calculateArea(double radius) {
        double pi = 3.14;
                return pi * radius * radius;
    }
}

