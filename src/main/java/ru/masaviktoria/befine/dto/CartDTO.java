package ru.masaviktoria.befine.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.masaviktoria.befine.domain.DeliveryList;

import java.util.*;

@Getter
@Setter
@NoArgsConstructor
public class CartDTO {

    private List<ProductDTO> productList;
    private Long customerId;
    private DeliveryList deliveryList;

}