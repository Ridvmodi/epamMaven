package Chocolates;

public class KitKat extends chocolate {
    public KitKat()
    {
        super.setWeight(35);
        super.setPrice(15);
        super.setCalories(150);
    }


    public String toString() {
        return super.toString("KitKat");
    }
}
