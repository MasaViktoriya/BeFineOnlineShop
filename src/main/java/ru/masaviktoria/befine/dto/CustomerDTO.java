package ru.masaviktoria.befine.dto;


import lombok.Getter;
import lombok.Setter;
import ru.masaviktoria.befine.domain.Order;
import ru.masaviktoria.befine.domain.Review;

import java.util.*;

@Getter
@Setter
public class CustomerDTO {

    private String login;
    private String adress;
    private String contacts;
    private List<Order> orderList;
    private List<Review> reviewList;
    private Long currentCartId;
    private Long currentOrderId;

    public CustomerDTO() {
    }


}