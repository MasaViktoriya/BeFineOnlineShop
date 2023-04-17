package ru.masaviktoria.befine.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Delivery<T> {

    private Long id;
    private Long orderId;
    private Class<T> delivery;

    public Delivery() {
    }

    public Delivery(Long orderId, Class<T> delivery) {
        this.orderId = orderId;
        this.delivery = delivery;
    }
}