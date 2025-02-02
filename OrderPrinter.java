import java.util.List;

// Class to handle printing of orders
public class OrderPrinter {
    /**
     * Prints the orders for each customer.
     * @param orderManager the order manager instance
     */
    public void printOrders(OrderManager orderManager) {
        List<String> customers = orderManager.getCustomers();
        List<String> orders = orderManager.getOrders();
        for (int index = OrderManager.INITIAL_INDEX; index < orders.size(); index++) {
            System.out.println("Customer: " + customers.get(index) + ", Order: " + orders.get(index));
        }
    }
}
