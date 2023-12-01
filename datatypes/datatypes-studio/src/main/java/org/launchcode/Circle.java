package org.launchcode;

public class Circle {
    // Method to calculate area of a circle
    public static Double getArea(Double radius) {
        final Double pi = 3.14;
        // Constant for the value of Pi
        return pi * radius * radius;
    }
    // Method for testing
    public static void main(String[]args) {
        Double radius = 2.5;
                double area = getArea(radius);
                System.out.println("The area of a circle with radius " + radius + " is: " + area);
    }
}
