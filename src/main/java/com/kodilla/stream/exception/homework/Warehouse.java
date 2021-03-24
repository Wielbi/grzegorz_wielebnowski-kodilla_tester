package com.kodilla.stream.exception.homework;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Warehouse {
    public List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        orderList.add(order);

    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        List<Order> resultList = orderList.stream()
                .filter(order -> order.getNumber().equals(number))
                .collect(Collectors.toList());
       if (resultList.size() > 0 ){
           return resultList.get(0);

       }else {
           throw new OrderDoesntExistException();
           }
       }

    }



