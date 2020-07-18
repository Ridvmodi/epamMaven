package Cookies;

public class CaramelChip extends cookies {
    double weight = 54;
    double price = 75;
    double calories = 132;

    @Override
    public double getCalories() {
        return calories;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "CaramelChip{" +
                "weight=" + weight +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}
