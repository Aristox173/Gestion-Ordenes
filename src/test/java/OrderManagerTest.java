import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class OrderManagerTest {
    private OrderManager orderManager;

    @BeforeEach
    void setUp() {
        orderManager = new OrderManager();
    }

    @Test
    void testAddOrder() {
        orderManager.addOrder("Alice", "Laptop");
        orderManager.addOrder("Bob", "Phone");

        // Verificar que se agregaron correctamente
        assertEquals(2, orderManager.getCustomers().size());
        assertEquals(2, orderManager.getOrders().size());

        // Verificar los valores almacenados
        assertEquals("Alice", orderManager.getCustomers().get(0));
        assertEquals("Laptop", orderManager.getOrders().get(0));
        assertEquals("Bob", orderManager.getCustomers().get(1));
        assertEquals("Phone", orderManager.getOrders().get(1));
    }

    @Test
    void testEmptyOrderManager() {
        assertTrue(orderManager.getCustomers().isEmpty());
        assertTrue(orderManager.getOrders().isEmpty());
    }
}
