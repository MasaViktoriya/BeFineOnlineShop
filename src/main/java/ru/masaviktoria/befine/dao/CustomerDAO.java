package ru.masaviktoria.befine.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;


@Entity
@Table(name = "customers")
@Getter
@Setter
public class CustomerDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "address")
    private String address;

    @Column(name = "contacts")
    private String contacts;

    @OneToOne
    @JoinColumn(name = "cart_id")
    private CartDAO cartDAO;

    @OneToOne
    @JoinColumn(name = "order_id")
    private OrderDAO orderDAO;

    @OneToMany(mappedBy = "customer")
    private Set<OrderDAO> ordersDAO;

    @OneToMany(mappedBy = "customer")
    private Set<ReviewDAO> rewiews;


    public CustomerDAO() {
    }


    public CustomerDAO(String login, String password, String address, String contacts, CartDAO cartDAO) {
        this.login = login;
        this.password = password;
        this.address = address;
        this.contacts = contacts;
        this.cartDAO = cartDAO;
    }
}