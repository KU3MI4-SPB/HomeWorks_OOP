package Home_Work_1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        System.out.println("<<<<<<<<ПОИСК ОСВЕЖАЮЩИХ НАПИТКОВ>>>>>>>>>");
        VendingMachineBottle vmBottle = new VendingMachineBottle();
        List<BottleOfWater> bottleList = new ArrayList<>(Arrays.asList(
                new BottleOfWater(prod.Cola.toString(), new BigDecimal(70), 0.5),
                new BottleOfWater(prod.Sprite.toString(), new BigDecimal(80), 0.5),
                new BottleOfWater(prod.Fanta.toString(), new BigDecimal(85), 0.5),
                new BottleOfWater("BonAqua", new BigDecimal(60), 0.5)));
                new BottleOfWater("Cola", new BigDecimal(2), 0.5);
                new BottleOfWater("Sprite", new BigDecimal(2.5), 0.5);
                new BottleOfWater("Fanta", new BigDecimal(1.9), 0.5);
        vmBottle.initProduct(bottleList);
        System.out.println(vmBottle.getProduct("BonAqua"));
        System.out.println(vmBottle.getProduct("Cola"));
        System.out.println(vmBottle.getProduct("Sprite"));
        System.out.println(vmBottle.getProduct("Fanta"));

        System.out.println("<<<<<<<<<ПОИСК ГОРЯЧИХ НАПИТКОВ>>>>>>>>>");
        VendingMachineHotDrinks vmHotDrinks = new VendingMachineHotDrinks();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Coffee", new BigDecimal(120), 0.3, 80),
                new HotDrinks("Tea", new BigDecimal(80), 0.4, 70),
                new HotDrinks("Milk", new BigDecimal(100), 0.5, 50)));
        vmHotDrinks.initProduct(hotDrinksList);
        System.out.println("Поиск по названию: " + vmHotDrinks.getProduct("Coffee"));
        System.out.println("Поиск по цене: " + vmHotDrinks.getProduct(new BigDecimal(2.5)));
        System.out.println("Поиск по температуре: " + vmHotDrinks.getProduct(70));

        System.out.println("<<<<<<<<ПОИСК ШОКОЛАДОК>>>>>>>>>");
        VendingMachineSnacks vmSnacks = new VendingMachineSnacks();
        List<Chocolate> chocolateList = new ArrayList<>(Arrays.asList(
                new Chocolate("Mars", new BigDecimal(50), 200),
                new Chocolate("Snickers", new BigDecimal(60), 250),
                new Chocolate("Twiks", new BigDecimal(70), 280),
                 new Chocolate("Bounty", new BigDecimal(70), 180)));
        vmSnacks.initProduct(chocolateList);
        System.out.println(vmSnacks.getProductByCalories(200));
        System.out.println(vmSnacks.getProductByCalories(250));
        System.out.println(vmSnacks.getProductByCalories(280));
        System.out.println(vmSnacks.getProductByCalories(180));
    }

    enum prod {
        Cola,
        Sprite,
        Fanta,
    }
}