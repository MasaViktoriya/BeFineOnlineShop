package ru.masaviktoria.befine.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.masaviktoria.befine.dao.ReviewDAO;
import ru.masaviktoria.befine.dao.ReviewRepository;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewDAO createReview(ReviewDAO reviewDAO) {
        return null;
    }

    public void updateReview(ReviewDAO reviewDAO) {

    }

    public void deleteReview(Long reviewId) {

    }

    public ReviewDAO showReview(Long reviewId) {
        return null;
    }
}