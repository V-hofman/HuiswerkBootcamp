package opdracht3;


import opdracht2.Circle;

public class Rectangle implements Comparable<Rectangle> {
    private double length;
    private double width;
    private double area;
    private double circumference;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.area = calculateArea();
        this.circumference = calculateCircumference();
    }

    private double calculateArea() {
        return this.width * this.length;
    }

    private double calculateCircumference() {
        return (2 * this.width) + (2 * this.length);
    }

    public int compareTo(Rectangle rect) {
        return Double.compare(area, rect.area);
    }

    public Rectangle addRectangles(Rectangle rect) {
        return new Rectangle(this.width + rect.width, this.length + rect.width);
    }

    @Override
    public String toString()
    {
        return "\n========\n"+ "Length: " + this.length + "\nWidth: " + this.width + "\nArea: " + this.area + "\nCircumference: " + this.circumference;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getArea() {
        return this.area;
    }

    public double getCircumference() {
        return this.circumference;
    }
}
