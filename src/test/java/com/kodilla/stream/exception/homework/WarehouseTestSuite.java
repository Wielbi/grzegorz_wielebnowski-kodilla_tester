package com.kodilla.stream.exception.homework;


import org.junit.Test;

import java.util.function.BooleanSupplier;


public class WarehouseTestSuite {
    private Object assertTrue;

    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("0"));
        //when
        warehouse.getOrder("1");

    }

}