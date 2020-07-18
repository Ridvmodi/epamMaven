package Cakes;

public class Blueberry implements cake {

    private double weight = 500;
    private double price = 650;
    private double calories = 1223;

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
        return "Blueberry{" +
                "weight=" + weight +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}
