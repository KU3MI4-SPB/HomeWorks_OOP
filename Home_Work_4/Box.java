package Home_Work_4;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public float getWeight() {
        float totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public void transferFruits(Box<T> anotherBox) {
        if (this == anotherBox) {
            return;
        }
        
        if (!fruits.isEmpty() && !anotherBox.fruits.isEmpty() && !fruits.get(0).getClass().equals(anotherBox.fruits.get(0).getClass())) {
            System.out.println("Нельзя помещать разные типы фруктов в одну коробку.");
            return;
        }
        
        anotherBox.fruits.addAll(fruits);
        fruits.clear();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public int getFruits() {
        return fruits.size();
    }
}
