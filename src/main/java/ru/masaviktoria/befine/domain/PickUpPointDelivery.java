package ru.masaviktoria.befine.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.masaviktoria.befine.dto.OfflineDeliveryDTO;

import java.util.*;
import java.time.*;

@Getter
@Setter
@NoArgsConstructor
public class PickUpPointDelivery {

    private Long id;
    private Long orderId;
    private Long pickPointId;
    private LocalDateTime estimatedDateTime;
    private Integer price;
    private String pickUpPointAddress;
    private String deliveryStatus;
    private Long serviceProviderId;
    private String timetable;
    private List<Product> productsForThisDeliveryList;


    public PickUpPointDelivery(OfflineDeliveryDTO offlineDeliveryDTO) {
        this.id = offlineDeliveryDTO.getDeliveryId();
        this.orderId = offlineDeliveryDTO.getOrderId();
        this.pickUpPointAddress = offlineDeliveryDTO.getChosenAddress();
        this.deliveryStatus = offlineDeliveryDTO.getDeliveryStatus();
        this.productsForThisDeliveryList = offlineDeliveryDTO.getProductsForThisDeliveryList();
        this.estimatedDateTime = offlineDeliveryDTO.getEstimatedDateTime();
        this.price = offlineDeliveryDTO.getPrice();
        this.serviceProviderId = offlineDeliveryDTO.getServiceProviderId();
        this.timetable = offlineDeliveryDTO.getTimetable();
        this.pickPointId = offlineDeliveryDTO.getPickPointId();
    }

    public PickUpPointDelivery(Long id, Long orderId, Long pickPointId, LocalDateTime estimatedDateTime, Integer price, String pickUpPointAddress, String deliveryStatus, Long serviceProviderId, String timetable, List<Product> productsForThisDeliveryList) {
        this.id = id;
        this.orderId = orderId;
        this.pickPointId = pickPointId;
        this.estimatedDateTime = estimatedDateTime;
        this.price = price;
        this.pickUpPointAddress = pickUpPointAddress;
        this.deliveryStatus = deliveryStatus;
        this.serviceProviderId = serviceProviderId;
        this.timetable = timetable;
        this.productsForThisDeliveryList = productsForThisDeliveryList;
    }
}