package Chocolates;

import java.util.Comparator;

public class getChocolatesByCalories implements Comparator<chocolate> {
    @Override
    public int compare(chocolate c1, chocolate c2) {
        if(c1.getCalories() < c2.getCalories())
            return -1;
        else if(c1.getCalories() > c2.getCalories())
            return 1;
        else
            return 0;
    }
}
