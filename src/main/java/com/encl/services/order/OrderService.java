package com.encl.services.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final PersonRepository personRepository;

    @Autowired
    OrderService(PersonRepository personRepository) {
        this.personRepository=personRepository;
    }

    public OrderStatus placeOrder(Order order) {

        //what are the step to order something?
        return OrderStatus.PLACED;
    }

    public List<Person> getPeople() {
        return personRepository.findAll();
    }
}
