package ru.masaviktoria.befine.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository<T> extends JpaRepository<DeliveryDAO<T>, Long> {

    <T> void createDelivery(DeliveryDAO<T> deliveryDAO);
}