package ru.masaviktoria.befine.domain;


import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Category {

    private Long id;
    private String name;
    private Long parentCategoryId;
    private Set<Product> products = new HashSet<>();

    public Category() {
    }

    public Category(String name, Long parentCategoryId) {
        this.name = name;
        this.parentCategoryId = parentCategoryId;
    }
}
