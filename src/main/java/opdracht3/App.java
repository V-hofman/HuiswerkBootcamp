package opdracht3;

import opdracht2.Circle;
import opdracht2.compareCircle;

import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static void main(String[] args) {
        //Create collection of rectangles
        ArrayList<Rectangle> list = new ArrayList<Rectangle>() {{
            add(new Rectangle(4, 2));
            add(new Rectangle(7, 1));
            add(new Rectangle(2, 8));
        }};

        //We grab the singleton compare instance and create a new object that holds the values of the biggest rectangle
        compareRectangle comparer = compareRectangle.getInstance();
        Rectangle biggest = Collections.max(list, comparer);

        //Foreach loop that goes through the arraylist and if it has the same area as the big boy it will print an extra line
        for (Rectangle rect : list) {
            System.out.println(rect);
            if (rect.getArea() == biggest.getArea()) {
                System.out.println("This boy the biggest");
            }
        }

        //Here we sort the arraylist from small to big and print it again
        Collections.sort(list, comparer);
        System.out.println("\n=======" +
                "THIS ONE IS SORTED FROM SMALL TO BIGGIE" +
                "=======");

        for (Rectangle rect : list) {
            System.out.println(rect);
            if (rect.getArea() == biggest.getArea()) {
                System.out.println("This boy the biggest");
            }
        }

        double maxArea = 0, maxCircumference = 0;
        for (Rectangle rect : list) {
            maxArea += rect.getArea();
            maxCircumference += rect.getCircumference();
        }
        System.out.println("\n=======\nArea: " + maxArea + "\nCircumference: " + maxCircumference);
        System.out.println("This square is the size of all the previous squares");


    }
}
