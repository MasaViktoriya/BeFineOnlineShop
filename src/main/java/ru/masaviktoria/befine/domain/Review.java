package ru.masaviktoria.befine.domain;

import lombok.Getter;
import lombok.Setter;
import ru.masaviktoria.befine.dto.ReviewDTO;

import java.time.LocalDateTime;

@Getter
@Setter
public class Review {

    private Long id;
    private String title;
    private String text;
    private Long customerId;
    private Long productId;
    private LocalDateTime creationDateTime;
    private Integer rating;

    public Review() {
    }

    public Review(ReviewDTO reviewDTO) {
        this.title = reviewDTO.getTitle();
        this.text = reviewDTO.getText();
        this.customerId = reviewDTO.getCustomerId();
        this.productId = reviewDTO.getProductId();
        this.creationDateTime = reviewDTO.getCreationDateTime();
        this.rating = reviewDTO.getRating();
    }

    public Review(String title, String text, Long customerId, Long productId, LocalDateTime creationDateTime, Integer rating) {
        this.title = title;
        this.text = text;
        this.customerId = customerId;
        this.productId = productId;
        this.creationDateTime = creationDateTime;
        this.rating = rating;
    }
}