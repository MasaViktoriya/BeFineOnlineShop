package ru.masaviktoria.befine.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "products")
@Getter
@Setter
public class ProductDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long productId;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private Integer price;

    @ManyToMany()
    @JoinTable(name = "product_category", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<CategoryDAO> categories = new HashSet<>();

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "productDAO")
    @Where(clause = "in_cart = true")
    private List<CartProductDAO> cartProductsDAO = new ArrayList<>();


    public ProductDAO() {
    }


    public ProductDAO(String title, Integer price, Set<CategoryDAO> categories, String description) {
        this.title = title;
        this.price = price;
        this.categories = categories;
        this.description = description;
    }

}