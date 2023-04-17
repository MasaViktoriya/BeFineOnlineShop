package ru.masaviktoria.befine.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "deliveries")
@Getter
@Setter
public class DeliveryDAO<T> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="orderId")
    private Long orderId;

    @Column(name="delivery")
    private Class<T> delivery;

    public DeliveryDAO() {
    }

    public DeliveryDAO(Long orderId, Class<T> delivery) {
        this.orderId = orderId;
        this.delivery = delivery;
    }


}