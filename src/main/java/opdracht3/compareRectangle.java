package opdracht3;

import opdracht2.Circle;
import opdracht2.compareCircle;

import java.util.Comparator;

public class compareRectangle implements Comparator<Rectangle> {
    //only need a single comparer object, so we create a singleton
    static compareRectangle current_instance = null;

    //Not doing anything with the constructor, just making sure its private so we make sure only one instance exists
    private compareRectangle() {
    }

    //The new "Constructer" you call this when you want to get the instance, making this a global instance
    public static compareRectangle getInstance() {
        if (current_instance == null) {
            current_instance = new compareRectangle();
        }
        return current_instance;
    }

    //Override the compare so we can find the biggest. Different one than in Rectangle.java. This one doesnt sort.
    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        return Double.compare(o1.getArea(), o2.getArea());
    }
}
