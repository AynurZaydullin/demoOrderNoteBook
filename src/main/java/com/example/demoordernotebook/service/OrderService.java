package com.example.demoordernotebook.service;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class OrderService {
    public String order() {
        return "Order";
    }
}
