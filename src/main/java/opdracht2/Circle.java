package opdracht2;


//Need to implement Comparable to compare the size for opdracht 2.3
public class Circle implements Comparable<Circle> {

    //The values it needs
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

    //Custom message when we print the object
    public String toString()
    {
        return "\n========\n" + "Radius: " + this.radius + "\nArea: " + this.area + "\nCircumference: " + this.circumference;
    }


    //Overriding the compareTo() so that arraylist.sort knows what to compare in order to find the biggest one. this one sorts ascending
    @Override
    public int compareTo(Circle circle) {
        return Double.compare(radius, circle.radius);
    }

    public double getRadius(){return this.radius;}
    public double getCircumference() {return circumference;}
    public double getArea() {return area;}
}
