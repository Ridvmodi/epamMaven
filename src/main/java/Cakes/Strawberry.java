package Cakes;

public class Strawberry implements cake {
    private double weight = 750;
    private double price = 1000;
    private double calories = 1450;

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
        return "Strawberry{" +
                "weight=" + weight +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}
