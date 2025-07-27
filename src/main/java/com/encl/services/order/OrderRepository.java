package com.encl.services.order;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<CustomerOrder, Integer> {
    List<CustomerOrder> findByPersonName(String name);
}
