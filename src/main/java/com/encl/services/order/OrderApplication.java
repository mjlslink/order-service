package com.encl.services.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner {

    private final PersonRepository personRepository;
    private final OrderRepository orderRepository;

    @Autowired
    OrderApplication( PersonRepository personRepository, OrderRepository orderRepository ) {
        this.personRepository = personRepository;
        this.orderRepository = orderRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class);
    }

    @Override
    public void run(String... strings) throws Exception {
        // save idCard along with persons
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Tom", new IDCard()));
        persons.add(new Person("Daisy", new IDCard()));
        persons.add(new Person("Alex", new IDCard()));
        personRepository.saveAll(persons);

        Person person = new Person("Tom", new IDCard());
        CustomerOrder order1 = new CustomerOrder();
        CustomerOrder order2 = new CustomerOrder();
        order1.setPerson(person);
        order2.setPerson(person);
        person.setOrders(Arrays.asList(order1, order2));

// Save person, orders will be saved due to CascadeType.ALL
        personRepository.save(person);

       // List<Order> orders = new ArrayList<>();
        //orders.add(new Order(persons.get(2)));
        //orderRepository.saveAll(orders);
    }
}
