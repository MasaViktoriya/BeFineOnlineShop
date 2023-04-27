package ru.masaviktoria.befine.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import ru.masaviktoria.befine.services.ReviewService;

@Controller
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

}