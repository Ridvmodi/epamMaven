package Cookies;

public class VanillaEssence extends cookies {
    double weight = 78;
    double price = 60;
    double calories = 210;

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
        return "VanillaEssence{" +
                "weight=" + weight +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}
