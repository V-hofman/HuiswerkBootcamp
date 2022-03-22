package org.example;

public class Circle {

    private double radius;
    private double circumference;
    private double area;

    //Constructor that holds the values for the circle
    public Circle(double radius)
    {
        this.radius = radius;
        this.circumference = calculateCircumference();
        this.area = calculateArea();
    }

    //Calculate the circumference and area
    private double calculateArea()
    {
        return Math.PI * this.radius * this.radius;
    }

    private double calculateCircumference()
    {
        return 2 * Math.PI * this.radius;
    }

    public String toString()
    {
        return "\n========\n" + "Radius: " + this.radius + "\nArea: " + this.area + "\nCircumference: " + this.circumference;
    }
}
