package Home_Work_4;

public class Program {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();

        box1.addFruit(apple1);
        box1.addFruit(apple2);
        box2.addFruit(orange1);
        box2.addFruit(orange2);

        float box1Weight = box1.getWeight();
        float box2Weight = box2.getWeight();
        System.out.println("Коробка с яблоками весит: " + box1Weight);
        System.out.println("Коробка с апельсинами весит: " + box2Weight);

        boolean areEqual = box1.compare(box2);
        System.out.println("Коробки одинаковы по весу? - " + areEqual);

        Box<Apple> box3 = new Box<>();
        box3.addFruit(apple1);
        box1.transferFruits(box3);

        System.out.println("В коробке 1 фруктов: " + box1.getFruits());
        System.out.println("В коробке 2 фруктов: " + box2.getFruits());
        System.out.println("В коробке 3 фруктов: " + box3.getFruits());
    }
}

