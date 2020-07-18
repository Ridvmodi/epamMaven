package Cakes;

public class Butterscotch implements cake {
    private double weight = 250;
    private double price = 400;
    private double calories = 878;

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
        return "Butterscotch{" +
                "weight=" + weight +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}
