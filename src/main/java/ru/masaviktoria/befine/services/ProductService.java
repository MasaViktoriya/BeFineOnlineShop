package ru.masaviktoria.befine.services;

import ru.masaviktoria.befine.dao.ProductDAO;
import ru.masaviktoria.befine.dao.ReviewDAO;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    ProductDAO showProduct(Long productId);

    List<ProductDAO> showProductListWithFilters(Optional<String> title, Optional<Integer> minPrice, Optional<Integer> maxPrice, Optional<String> category, Optional<Integer> reviewRating);

    void deleteProduct(Long productId);

    List<ReviewDAO> showReviews(Long productId);
}
