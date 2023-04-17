package ru.masaviktoria.befine.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Supplies extends Product {

    private Long id;
    private String size;
    private BigDecimal weight;
    private String producer;

    public Supplies() {
    }



}