package execution_model.homework;

import java.time.LocalDate;
import java.util.Random;

public class Order {

    private double orderAmount;
    private LocalDate orderDate;
    private String login;

    public Order(double orderAmount, String login) {
        this.orderAmount = orderAmount;
        this.login = login;
        this.orderDate = LocalDate.now().minusYears(2);
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getLogin() {
        return login;
    }
}
