package com.encl.services.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final PersonRepository personRepository;

    private final OrderRepository orderRepository;

    @Autowired
    OrderService(PersonRepository personRepository, OrderRepository orderRepository) {
        this.personRepository=personRepository;
        this.orderRepository = orderRepository;
    }

   /* public OrderStatus placeOrder(Order order) {

        //what are the step to order something?
        return OrderStatus.PLACED;
    }
*/
    public List<Person> getPeople() {
        return personRepository.findAll();
    }

    /*public List<Order> getOrders(String name) {
        return orderRepository.findByPersonName(name);
    }*/

}
