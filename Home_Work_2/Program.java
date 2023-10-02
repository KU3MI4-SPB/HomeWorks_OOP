package Home_Work_2;

public class Program {
    public static void main(String[] args) {
        Cat[] cats = { new Cat("Барсик", 5), new Cat("Мурка", 8), new Cat("Рыжик", 10) };
        Plate plate = new Plate(20);
        
        plate.info();
        
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.getName() + " - его сытость: " + cat.isSatiety());
        }
        
        plate.info();
        
        plate.addFood(50);
        plate.info();
    }
}