package opdracht2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class compareCircleTest {

    @Test
    public void CircumferenceCalculateTest()
    {
       compareCircle comparer1 = compareCircle.getInstance();
       compareCircle comparer2 = compareCircle.getInstance();

       assertEquals(comparer1, comparer2);
    }

    @Test
    public void CompareTestSmaller()
    {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        compareCircle comparer1 = compareCircle.getInstance();
        comparer1.compare(circle1, circle2);
        assertEquals(-1,comparer1.compare(circle1, circle2));
    }

    @Test
    public void CompareTestBigger()
    {
        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(1);
        compareCircle comparer1 = compareCircle.getInstance();
        comparer1.compare(circle1, circle2);
        assertEquals(1,comparer1.compare(circle1, circle2));
    }

    @Test
    public void CompareTestEqual()
    {
        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(2);
        compareCircle comparer1 = compareCircle.getInstance();
        comparer1.compare(circle1, circle2);
        assertEquals(0,comparer1.compare(circle1, circle2));
    }
}
