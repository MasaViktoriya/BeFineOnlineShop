package ru.masaviktoria.befine.dto;

import lombok.Getter;
import lombok.Setter;
import ru.masaviktoria.befine.domain.Review;

import java.time.LocalDateTime;

@Getter
@Setter
public class ReviewDTO {

    private String title;
    private String text;
    private Long productId;
    private Long customerId;
    private Integer rating;
    private LocalDateTime creationDateTime;

    public ReviewDTO() {
    }

    public ReviewDTO(Review review) {
        this.title = review.getTitle();
        this.text = review.getText();
        this.customerId = review.getCustomerId();
        this.productId = review.getProductId();
        this.creationDateTime = review.getCreationDateTime();
        this.rating = review.getRating();
    }

    public ReviewDTO(String title, String text, Long productId, Long customerId, Integer rating, LocalDateTime creationDateTime) {
        this.title = title;
        this.text = text;
        this.productId = productId;
        this.customerId = customerId;
        this.rating = rating;
        this.creationDateTime = creationDateTime;
    }
}