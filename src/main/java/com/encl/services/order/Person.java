package com.encl.services.order;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
    private IDCard idCard;

    public Person(String name, IDCard idCard) {
        this.name = name;
        this.idCard = idCard;
        this.idCard.setPerson(this);
    }
}
