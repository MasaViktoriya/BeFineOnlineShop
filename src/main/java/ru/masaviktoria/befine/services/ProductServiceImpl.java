package ru.masaviktoria.befine.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.masaviktoria.befine.dao.ProductDAO;
import ru.masaviktoria.befine.dao.ReviewDAO;
import ru.masaviktoria.befine.dao.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductDAO showProduct(Long productId) {
        return null;
    }

    public List<ProductDAO> showProductListWithFilters(Optional<String> title, Optional<Integer> minPrice, Optional<Integer> maxPrice, Optional<String> category, Optional<Integer> reviewRating) {
        return null;
    }

    public void deleteProduct(Long productId) {

    }

    public List<ReviewDAO> showReviews(Long productId) {
        return null;
    }

}