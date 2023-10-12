package Home_Work_6;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public abstract class Save {
    public static void saveToJson(Order order) {
        String fileName = "Home_Work_6/order.json";
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8"))) {
            Client client = order.getClient();
            Product product = order.getProduct();
            writer.write("{\n");
            writer.write("\"Имя клиента\":\"" + client.getFirstName() + "\",\n");
            writer.write("\"Фамилия клиента\":\"" + client.getLastName() + "\",\n");
            writer.write("\"Телефон клиента\":\"" + client.getPhoneNumber() + "\",\n");
            writer.write("\"Бренд\":\"" + product.getBrand() + "\",\n");
            writer.write("\"Модель\":\"" + product.getModel() + "\",\n");
            writer.write("\"Цена\":" + product.getPrice() + ",\n");
            writer.write("\"Количество\":" + order.getQnt() + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
