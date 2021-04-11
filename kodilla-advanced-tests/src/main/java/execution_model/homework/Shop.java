package execution_model.homework;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;

public class Shop {

    Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Set<Order> getLast2YearsOrders(){
        Set<Order> result = new HashSet<>();
        LocalDate now = LocalDate.now();
        for(Order o: orders) {
            if(Period.between(o.getOrderDate(),now).getYears() <= 2) {
                result.add(o);
            }
        }
        return result;
    }

    public Set<Order> getOrdersInRange(double a, double b) {
        Set<Order> result = new HashSet<>();
        for(Order o: orders) {
            if(o.getOrderAmount() >= a && o.getOrderAmount() <= b) {
                result.add(o);
            }
        }
        return result;
    }

    public long getOrdersCount(){
        return orders.stream().count();
    }

    public double getAmountOfAllOrders(){
        Double result = 0.0;
        for(Order o: orders) {
            result += o.getOrderAmount();
        }
        return result;
    }

}
