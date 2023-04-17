package ru.masaviktoria.befine.domain;

import lombok.Getter;
import lombok.Setter;


import java.util.Set;


@Getter
@Setter
public class Customer {

    private Long id;
    private String login;
    private String password;
    private String address;
    private String contacts;
    private Cart cart;

    private Order order;

    private Set<Order> orders;

    private Set<Review> rewiews;


    public Customer() {
    }


    public Customer(String login, String password, String address, String contacts, Cart cart) {
        this.login = login;
        this.password = password;
        this.address = address;
        this.contacts = contacts;
        this.cart = cart;
    }
}