package ru.masaviktoria.befine.web;

import org.springframework.stereotype.Controller;
import ru.masaviktoria.befine.services.ReviewService;

@Controller
public class ReviewController {

    private ReviewService reviewService;


    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }


}