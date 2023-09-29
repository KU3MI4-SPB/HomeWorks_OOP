package Home_Work_1;

// import java.util.ArrayList;
import java.util.List;

// /**
//  * Класс торгового автомата для шоколадок
//  */
// public class VendingMachineSnacks implements VendingMachine {
//     List<Chocolate> chocolateList = new ArrayList<>();

//     /**
//      * Переопределенный метод внесения продуктов в автомат
//      */
//     @Override
//     public void initProduct() {
//     }

//     /**
//      * Перегруженный метод внесения шоколадок
//      *
//      * @param chocolates Список экземпляров класса шоколадок
//      */
//     public void initProduct(List<Chocolate> chocolates) {
//         chocolateList.addAll(chocolates);
//     }

//     /**
//      * Переопределенный метод получения продукта из автомата
//      *
//      * @return шоколадка из списка или null, если список пуст
//      */
//     @Override
//     public String getProduct() {
//         return null; // Если список шоколадок пуст, вернуть null
        
//     }

//     public char[] getProduct(String string) {
//         return null;
//     }
public class VendingMachineSnacks {
    private List<Chocolate> productList;

    public void initProduct(List<Chocolate> productList) {
        this.productList = productList;
    }

    public Chocolate getProductByCalories(int calories) {
        for (Chocolate chocolate : productList) {
            if (chocolate.getCalories() == calories) {
                return chocolate;
            }
        }
        return null;
    }
}