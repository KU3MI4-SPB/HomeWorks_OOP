package Home_Work_1;

import java.math.BigDecimal;

public class Chocolate extends Product {
    private int calories;

    public Chocolate(String name, BigDecimal price, int calories) {
        super(name, price);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return super.toString() + " Калорийность: " + calories;
    }
}