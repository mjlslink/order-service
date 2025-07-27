package com.encl.services.order;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Many orders belong to one person
    @ManyToOne
    @JoinColumn(name = "person_id") // FK in Order table
    private Person person;
}
