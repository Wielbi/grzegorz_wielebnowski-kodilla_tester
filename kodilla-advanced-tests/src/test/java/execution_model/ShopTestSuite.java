package execution_model;

import execution_model.homework.Order;
import execution_model.homework.Shop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {

    Shop shop = new Shop();

    @BeforeEach
    public void initShop() {
        shop.addOrder(new Order(20, "mjasiu"));
        shop.addOrder(new Order(30, "grzesiu"));
        shop.addOrder(new Order(10, "jacek"));
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
        Set<Order> orders = shop.getLast2YearsOrders();
        assertEquals(3, orders.size());
    }
}
