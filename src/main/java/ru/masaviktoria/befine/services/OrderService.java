package ru.masaviktoria.befine.services;

import ru.masaviktoria.befine.dao.OrderDAO;

public interface OrderService {

    OrderDAO createOrder(OrderDAO orderDAO);

    void updateOrder(OrderDAO orderDAO);

    void deleteOrder(Long id);

    OrderDAO showOrder(Long id);

    void changeDelivery();
}
