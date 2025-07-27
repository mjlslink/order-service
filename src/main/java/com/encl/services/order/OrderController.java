package com.encl.services.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/order")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    OrderController(OrderService service) {
        orderService = service;
    }

    @GetMapping("people")
    public ResponseEntity<List<Person>> getPeople() {
        List<Person> people = orderService.getPeople();
        return ResponseEntity.ok(people);
    }

    @GetMapping("one")
    public ResponseEntity<Person> getOne() {
        Person people = orderService.getFirst();
        return ResponseEntity.ok(people);
    }
}
