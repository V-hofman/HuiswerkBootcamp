package opdracht2;

import java.util.Comparator;

//Need to implement Comparator so we can compare multiple objects inside an array
public class compareCircle implements Comparator<Circle> {

    //only need a single comparer object, so we create a singleton
    static compareCircle current_instance = null;

    //Not doing anything with the constructor, just making sure its private so we make sure only one instance exists
    private compareCircle() {
    }

    //The new "Constructer" you call this when you want to get the instance, making this a global instance
    public static compareCircle getInstance() {
        if (current_instance == null) {
            current_instance = new compareCircle();
        }
        return current_instance;
    }

    //Override the compare so we can find the biggest. Different one than in Circle.java. This one doesnt sort.
    @Override
    public int compare(Circle o1, Circle o2) {
        return Double.compare(o1.getRadius(), o2.getRadius());
    }
}
