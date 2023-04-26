package ru.masaviktoria.befine.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Delivery<T> {

    private Long id;
    private Long orderId;
    private Class<T> delivery;


    public Delivery(Long orderId, Class<T> delivery) {
        this.orderId = orderId;
        this.delivery = delivery;
    }
}