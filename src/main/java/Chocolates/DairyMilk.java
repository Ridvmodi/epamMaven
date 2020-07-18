package Chocolates;

public class DairyMilk extends chocolate {
    public DairyMilk(){
        super.setWeight(30);
        super.setPrice(10);
        super.setCalories(110);
    }

    @Override
    public String toString() {
        return super.toString("Dairy Milk");
    }
}
