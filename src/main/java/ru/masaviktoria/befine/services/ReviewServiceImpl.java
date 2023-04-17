package ru.masaviktoria.befine.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.masaviktoria.befine.dao.ReviewDAO;
import ru.masaviktoria.befine.dao.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService {

    private ReviewRepository reviewRepository;

    @Autowired
    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public ReviewDAO createReview(ReviewDAO reviewDAO) {

    }

    public void updateReview(ReviewDAO reviewDAO) {

    }

    public void deleteReview(Long reviewId) {

    }

    public ReviewDAO showReview(Long reviewId) {

    }
}