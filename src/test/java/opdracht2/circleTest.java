package opdracht2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Collections;

/**
 * Unit test for simple opdracht2.App.
 */
public class circleTest
{

    @Test
    public void CircumferenceCalculateTest()
    {
        Circle circle = new Circle(1);
        assertEquals(6.28319,circle.getCircumference(),0.1);
    }

    @Test
    public void AreaCalculateTest()
    {
        Circle circle = new Circle(1);
        assertEquals(3.14159,circle.getArea(),0.1);
    }

    @Test
    public void compareTestSmaller()
    {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        assertEquals(-1, circle1.compareTo(circle2));
    }
    @Test
    public void compareTestBigger()
    {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(2);
        assertEquals(1, circle1.compareTo(circle2));
    }
    @Test
    public void compareTestEqual()
    {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(1);
        assertEquals(0, circle1.compareTo(circle2));
    }

    @Test
    public void toStringTest()
    {
        Circle circle = new Circle(1);
        assertEquals("\n========\n" + "Radius: " + circle.getRadius() + "\nArea: " + circle.getArea() + "\nCircumference: " + circle.getCircumference(),circle.toString());
    }
}
