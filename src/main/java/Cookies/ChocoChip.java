package Cookies;

public class ChocoChip extends cookies  {
    double weight = 35;
    double price = 20;
    double calories = 143;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "ChocoChip{" +
                "weight=" + weight +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}
