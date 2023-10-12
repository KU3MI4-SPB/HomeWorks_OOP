package Home_Work_6;

public class Order {

    private static int count;
    private final int id;
    private Client client;
    private Product product;
    private int qnt;


    static {
        count = 0;
    }

    public Order() {
        id = count++;
        inputFromConsole();
    }

    public Order(Client client, Product product, int qnt) {
        this.client = client;
        this.product = product;
        this.qnt = qnt;
        this.id = count++;
    }

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return product.getPrice();
    }

    public int getId() {
        return id;
    }


    public void inputFromConsole(){
        client = Maintenance.getClientFromConsole(client);
        product = Maintenance.getProductFromConsole(product);
        qnt = Maintenance.getQuantity();
    }



}
