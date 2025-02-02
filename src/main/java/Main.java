import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();
        orderManager.addOrder("Alice", "Laptop");
        orderManager.addOrder("Bob", "Phone");
        OrderPrinter orderPrinter = new OrderPrinter();
        orderPrinter.printOrders(orderManager);
    }
}