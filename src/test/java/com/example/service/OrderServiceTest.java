package com.example.service;

import com.example.demoordernotebook.service.OrderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    private final OrderService out = new OrderService();
    @Test
    public void shouldReturnOrder(){
        String result = out.order();
        Assertions.assertTrue(result.contains("Order"));
    }
}
