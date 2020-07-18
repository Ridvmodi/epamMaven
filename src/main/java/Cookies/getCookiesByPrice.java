package Cookies;

import java.util.Comparator;

public class getCookiesByPrice implements Comparator<cookies>
{
    public int compare(cookies c1, cookies c2)
    {
        if(c1.getPrice() < c2.getPrice())
            return -1;
        else if(c1.getPrice() > c2.getPrice())
            return 1;
        else
            return 0;
    }
}
