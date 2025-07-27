package com.encl.services.order;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name="id_card_id")
    @JsonManagedReference
    private IDCard idCard;

    @OneToOne(mappedBy = "person")
    private Person person;

    public Person() {}

    public Person(String name, IDCard idCard) {
        this.name = name;
        this.idCard = idCard;
        this.idCard.setPerson(this);
    }
}
