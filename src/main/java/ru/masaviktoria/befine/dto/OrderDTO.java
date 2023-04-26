package ru.masaviktoria.befine.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.masaviktoria.befine.domain.Delivery;

import java.util.*;
import java.time.*;

@Getter
@Setter
@NoArgsConstructor
public class OrderDTO {
    private List<ProductDTO> productList;
    private Long customerId;
    private LocalDateTime purchaseDateTime;
    private List<Delivery> deliveryList;
    private Boolean isDelivered;
    private Boolean isCancelled;
    private Boolean isOnReturn;
    private Boolean isReturned;
    private Boolean isActive;
    private Long id;

}