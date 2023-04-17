package ru.masaviktoria.befine.services;

import ru.masaviktoria.befine.dao.CartDAO;
import ru.masaviktoria.befine.dto.ProductDTO;

public interface CartService {

   void addToCart(ProductDTO productDTO);

    void changeProductQuantity(Integer newQuantity);

    Integer recalculatePrice(CartDAO cartDAO);

    CartDAO createCart(CartDAO cartDAO);

    void updateCart(CartDAO cartDAO);

    void cleanCart(Long id);

    void proceedToPurchase(CartDAO cartDAO);

    CartDAO showCart(Long id);

    void chooseDeliveries();
}
