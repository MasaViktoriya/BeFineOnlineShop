package ru.masaviktoria.befine.services;

import ru.masaviktoria.befine.dao.CartDAO;
import ru.masaviktoria.befine.dao.CustomerDAO;
import ru.masaviktoria.befine.dao.OrderDAO;
import ru.masaviktoria.befine.dao.ReviewDAO;

import java.util.List;

public interface CustomerService {

    CustomerDAO registerNewCustomer(CustomerDAO customerDAO);

    void updateCustomerInfo(CustomerDAO customerDAO);

    List<OrderDAO> showOrderList();

    CartDAO showCurrentCart(Long cartId);

    OrderDAO showCurrentOrder(Long orderId);

    List<ReviewDAO> showReviewList();
}
