package ru.masaviktoria.befine.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.masaviktoria.befine.dto.ReviewDTO;

import java.time.LocalDateTime;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class ReviewDAO {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "text")
    private String text;

    @Column(name = "customerId")
    private Long customerId;

    @Column(name = "productId")
    private Long productId;

    @Column(name = "creationDateTime")
    private LocalDateTime creationDateTime;

    @Column(name = "rating")
    private Integer rating;


    public ReviewDAO(ReviewDTO reviewDTO) {
        this.title = reviewDTO.getTitle();
        this.text = reviewDTO.getText();
        this.customerId = reviewDTO.getCustomerId();
        this.productId = reviewDTO.getProductId();
        this.creationDateTime = reviewDTO.getCreationDateTime();
        this.rating = reviewDTO.getRating();
    }

    public ReviewDAO(String title, String text, Long customerId, Long productId, LocalDateTime creationDateTime, Integer rating) {
        this.title = title;
        this.text = text;
        this.customerId = customerId;
        this.productId = productId;
        this.creationDateTime = creationDateTime;
        this.rating = rating;
    }
}