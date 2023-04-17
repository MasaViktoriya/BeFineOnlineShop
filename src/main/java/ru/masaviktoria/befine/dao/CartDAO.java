package ru.masaviktoria.befine.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "carts")
@Getter
@Setter
public class CartDAO {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @OneToMany(mappedBy = "cartDAO")
    private List<CartProductDAO> cartProductsDAO;

    @Column(name = "creationDateTime")
    private LocalDateTime creationDateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private CustomerDAO customerDAO;

    @Column(name = "delivery_list")
    private String deliveryListJSON;


    public CartDAO() {

    }

    public CartDAO(List<CartProductDAO> cartProductsDAO, LocalDateTime creationDateTime, CustomerDAO customerDAO, String deliveryList) {
        this.cartProductsDAO = cartProductsDAO;
        this.creationDateTime = creationDateTime;
        this.customerDAO = customerDAO;
        this.deliveryListJSON = deliveryList;
    }
}