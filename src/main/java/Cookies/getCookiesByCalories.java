package Cookies;

import java.util.Comparator;

public class getCookiesByCalories implements Comparator<cookies>
{
    public int compare(cookies c1, cookies c2)
    {
        if(c1.getCalories() < c2.getCalories())
            return -1;
        else if(c1.getCalories() > c2.getCalories())
            return 1;
        else
            return 0;

    }

}
