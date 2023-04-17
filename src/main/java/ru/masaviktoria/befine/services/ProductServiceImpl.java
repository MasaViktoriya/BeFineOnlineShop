package ru.masaviktoria.befine.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.masaviktoria.befine.dao.ProductDAO;
import ru.masaviktoria.befine.dao.ReviewDAO;
import ru.masaviktoria.befine.dao.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public ProductDAO showProduct(Long productId) {

    }

    public List<ProductDAO> showProductListWithFilters(Optional<String> title, Optional<Integer> minPrice, Optional<Integer> maxPrice, Optional<String> category, Optional<Integer> reviewRating) {

    }

    public void deleteProduct(Long productId) {

    }

    public List<ReviewDAO> showReviews(Long productId) {

    }

}