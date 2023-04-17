package ru.masaviktoria.befine.services;

import ru.masaviktoria.befine.dao.ReviewDAO;

public interface ReviewService {

    ReviewDAO createReview(ReviewDAO reviewDAO);

    void updateReview(ReviewDAO reviewDAO);

    void deleteReview(Long reviewId);

    ReviewDAO showReview(Long reviewId);
}
