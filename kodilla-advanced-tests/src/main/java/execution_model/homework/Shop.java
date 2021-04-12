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

    public Set<Order> getOrdersInDateRange(LocalDate minRangeDate, LocalDate maxRangeDate){
        Set<Order> result = new HashSet<>();
        for(Order o: orders) {
            if(o.getOrderDate().isAfter(minRangeDate) && o.getOrderDate().isBefore(maxRangeDate)) {
                result.add(o);
            }
        }
        return result;
    }

    public Set<Order> getOrdersInRange(double minValue, double maxValue) {
        Set<Order> result = new HashSet<>();
        for(Order o: orders) {
            if(o.getOrderAmount() >= minValue && o.getOrderAmount() <= maxValue) {
                result.add(o);
            }
        }
        return result;
    }

    public long getOrdersCount(){
        return orders.size();
    }

    public double getAmountOfAllOrders(){
        Double result = 0.0;
        for(Order o: orders) {
            result += o.getOrderAmount();
        }
        return result;
    }

}
