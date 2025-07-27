package com.encl.services.order;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public OrderStatus placeOrder(Order order) {

        //what are the step to order something?

        return OrderStatus.PLACED;
    }
}
