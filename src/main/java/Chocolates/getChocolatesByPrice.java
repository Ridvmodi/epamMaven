package Chocolates;

import java.util.Comparator;

public class getChocolatesByPrice implements Comparator<chocolate> {
    @Override
    public int compare(chocolate c1, chocolate c2) {
        if(c1.getPrice() < c2.getPrice())
            return  -1;
        else if(c1.getPrice() > c2.getPrice())
            return 1;
        else
            return 0;

    }
}
