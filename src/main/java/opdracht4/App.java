package opdracht4;

import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static void main(String[] args) {

        ArrayList<Time> list = new ArrayList<Time>() {{
            add(new Time(2, 2, 2022));
            add(new Time(7, 1, 2021));
            add(new Time(2, 8, 2023));
        }};


        System.out.println("\nBefore:");
        for (Time date : list) {
            System.out.println(date);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).compareTo(list.get(i + 1)) == 1) {
                Collections.swap(list, i, i + 1);
            }
        }
        System.out.println("\nAfter:");
        for (Time date : list) {
            System.out.println(date);
        }
    }
}
