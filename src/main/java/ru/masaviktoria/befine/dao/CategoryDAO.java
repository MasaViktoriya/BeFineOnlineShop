package ru.masaviktoria.befine.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categories")
@Getter
@Setter
public class CategoryDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "parent_category_id")
    private Long parentCategoryId;

    @ManyToMany(mappedBy = "categories")
    private Set<ProductDAO> productsDAO = new HashSet<>();

    public CategoryDAO() {
    }

    public CategoryDAO(String name, Long parentCategoryId) {
        this.name = name;
        this.parentCategoryId = parentCategoryId;
    }
}
