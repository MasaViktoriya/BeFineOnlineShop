package ru.masaviktoria.befine.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CartProductDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private CartDAO cartDAO;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductDAO productDAO;

    private int quantity;

    @Column(name = "in_cart")
    private boolean inCart;
}
