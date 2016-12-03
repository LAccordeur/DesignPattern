import com.guoyang.beverage.duckSort.Duck;

import java.util.Arrays;

/**
 * Created by L'Accordeur on 2016/12/3.
 */
public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7)
        };

        System.out.println("Before sorting:");
        display(ducks);

        Arrays.sort(ducks);
        System.out.println("\nAfter sorting:");
        display(ducks);
    }

    public static void display(Duck[] ducks) {
        for (int i = 0;i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }
}
