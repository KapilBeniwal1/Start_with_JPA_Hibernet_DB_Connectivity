package com.Kapil.UserAccio;

import jakarta.persistence.*;

@Entity
@Table(name = "library_card")
public class Card {
    @Id
    private int cardNo; //primary key of our table

    private int fine;

    private int bookIssued;

    @OneToOne // mapping relation between two entity

    @JoinColumn() // always be written in child class
    // we are telling : add a foreign key column ....
    // define the column name
    // of the parent class , by default it's the primary key of the parent class
    // OR -> if we want to explicitly join a column it should be unique & not NULL in parent table
    User user;

    //child class will have the foreign key which is the reference of primary key
    //in the parent class
    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;
}