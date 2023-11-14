package com.example.demoordernotebook.service.pojo;

import jakarta.persistence.*;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String department;

    private String position;
    private int term;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "position_id")
    private Supplyer supplyer;
    public Order() {
    }

    public Order(Long id, String position, int term) {
        this.id = id;
        this.position = position;
        this.term = term;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String name) {
        this.position = name;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int salary) {
        this.term = salary;
    }
}
