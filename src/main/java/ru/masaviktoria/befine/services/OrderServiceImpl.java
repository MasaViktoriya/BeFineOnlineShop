package ru.masaviktoria.befine.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.masaviktoria.befine.dao.OrderDAO;
import ru.masaviktoria.befine.dao.OrderRepository;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

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