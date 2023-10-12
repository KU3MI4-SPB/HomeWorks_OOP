package Home_Work_6;

import java.util.Scanner;

public abstract class Maintenance {
    private static String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public static Client getClientFromConsole(Client client){
        String clientFirstName = prompt("Имя клиента: ");
        String clientLastName = prompt("Фамилия клиента: ");
        String clientPhoneNumber = prompt("Телефон клиента: ");

        if(client != null) {
            client.setFirstName(clientFirstName);
            client.setLastName(clientLastName);
            client.setPhoneNumber(clientPhoneNumber);
        } else
            client = new Client(clientFirstName, clientLastName, clientPhoneNumber);
        return client;
    }

    public static Product getProductFromConsole(Product product){
        String productBrand = prompt("Бренд: ");
        String productName = prompt("Модель: ");
        double productPrice = Double.parseDouble(prompt("Цена: "));

        if(product != null) {
            product.setBrand(productBrand);
            product.setName(productName);
            product.setPrice(productPrice);
        } else
            product = new Product(productBrand, productName, productPrice);
        return product;
    }

    public static int getQuantity(){
        return Integer.parseInt(prompt("Количество: "));
    }

}