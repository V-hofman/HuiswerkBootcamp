package opdracht2;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        //We create a collection and add a few circles
        ArrayList<Circle> list = new ArrayList<Circle>() {{
            add(new Circle(4));
            add(new Circle(7));
            add(new Circle(2));
        }};

        //We grab the singleton compare instance and create a new object that holds the values of the biggest circle
        compareCircle comparer = compareCircle.getInstance();
        Circle biggest = Collections.max(list, comparer);

        //For each loop that goes through the arraylist and if it has the same radius as the big boy it will print an extra line
        for (Circle circle : list) {
            System.out.println(circle);
            if (circle.getRadius() == biggest.getRadius()) {
                System.out.println("This boy the biggest");
            }
        }

        //Here we sort the arraylist from small to big and print it again
        Collections.sort(list, comparer);
        System.out.println("\n=======" +
                "THIS ONE IS SORTED FROM SMALL TO BIGGIE" +
                "=======");
        for (Circle circle : list) {
            System.out.println(circle);
            if (circle.getRadius() == biggest.getRadius()) {
                System.out.println("This boy the biggest");
            }
        }

    }

}
