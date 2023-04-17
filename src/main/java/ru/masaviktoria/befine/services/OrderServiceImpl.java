package ru.masaviktoria.befine.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.masaviktoria.befine.dao.OrderDAO;
import ru.masaviktoria.befine.dao.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderDAO createOrder(OrderDAO orderDAO) {
        return null;
    }

    public void updateOrder(OrderDAO orderDAO) {

    }

    public void deleteOrder(Long id) {

    }

    public OrderDAO showOrder(Long id) {
        return null;
    }

    public void changeDelivery() {

    }

}