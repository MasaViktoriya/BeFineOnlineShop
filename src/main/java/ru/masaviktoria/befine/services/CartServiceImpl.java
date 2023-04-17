package ru.masaviktoria.befine.services;

import org.springframework.stereotype.Service;
import ru.masaviktoria.befine.dao.CartDAO;
import ru.masaviktoria.befine.dto.ProductDTO;
import ru.masaviktoria.befine.dao.CartRepository;

@Service
public class CartServiceImpl implements CartService {

    private CartRepository cartRepository;

    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public void addToCart(ProductDTO productDTO) {

    }

    public void changeProductQuantity(Integer newQuantity) {

    }

    public Integer recalculatePrice(CartDAO cartDAO) {
        return null;
    }

    public CartDAO createCart(CartDAO cartDAO) {
        return null;
    }

    public void updateCart(CartDAO cartDAO) {

    }

    public void cleanCart(Long id) {

    }

    public void proceedToPurchase(CartDAO cartDAO) {

    }

    public CartDAO showCart(Long id) {
        return null;
    }

    public void chooseDeliveries() {

    }

}