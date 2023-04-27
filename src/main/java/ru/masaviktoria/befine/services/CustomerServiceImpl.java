package ru.masaviktoria.befine.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.masaviktoria.befine.dao.CartDAO;
import ru.masaviktoria.befine.dao.CustomerDAO;
import ru.masaviktoria.befine.dao.OrderDAO;
import ru.masaviktoria.befine.dao.ReviewDAO;
import ru.masaviktoria.befine.dao.CustomerRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerDAO registerNewCustomer(CustomerDAO customerDAO) {
        return null;
    }

    public void updateCustomerInfo(CustomerDAO customerDAO) {

    }

    public List<OrderDAO> showOrderList() {
        return null;
    }

    public CartDAO showCurrentCart(Long cartId) {
        return null;
    }

    public OrderDAO showCurrentOrder(Long orderId) {
        return null;
    }

    public List<ReviewDAO> showReviewList() {
        return null;
    }

}