package execution_model;

import execution_model.homework.Order;
import execution_model.homework.Shop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {

    Shop shop = new Shop();

    @BeforeEach
    public void initShop() {
        shop.addOrder(new Order(20, "mjasiu", LocalDate.now()));
        shop.addOrder(new Order(30, "grzesiu", LocalDate.now()));
        shop.addOrder(new Order(10, "jacek", LocalDate.now()));
    }

    @Test
    public void testGetOrdersCount() {
        double sum = shop.getOrdersCount();
        assertEquals(3, sum);
    }

    @Test
    public void testAmountOfAllOrders() {
        double sum = shop.getAmountOfAllOrders();
        assertEquals(60, sum);
    }

    @Test
    public void testGetOrdersInRange() {
        Set<Order> orders = shop.getOrdersInRange(20, 30);
        assertEquals(2, orders.size());
    }

    @Test
    public void testGetLast2YearsOrders() {
        Set<Order> orders = shop.getOrdersInDateRange(LocalDate.now().minusDays(1),LocalDate.now().plusDays(2));
        assertEquals(3, orders.size());
    }
}
