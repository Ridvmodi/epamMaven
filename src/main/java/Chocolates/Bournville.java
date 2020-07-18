package Chocolates;

public class Bournville extends chocolate {
    public Bournville()
    {
        super.setWeight(50);
        super.setPrice(40);
        super.setCalories(190);
    }

    @Override
    public String toString() {
        return super.toString("Bournville");
    }
}
