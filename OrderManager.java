import java.util.ArrayList;
import java.util.List;

// Class to manage orders
public class OrderManager {
    private List<String> customers = new ArrayList<>();
    private List<String> orders = new ArrayList<>();

    // Constant for initial index
    private static final int INITIAL_INDEX = 0;

    /**
     * Adds an order for a customer.
     * @param customer the name of the customer
     * @param order the order details
     */
    public void addOrder(String customer, String order) {
        customers.add(customer);
        orders.add(order);
        System.out.println("Order added for: " + customer);
    }

    /**
     * Returns the list of customers.
     * @return list of customers
     */
    public List<String> getCustomers() {
        return customers;
    }

    /**
     * Returns the list of orders.
     * @return list of orders
     */
    public List<String> getOrders() {
        return orders;
    }
}
