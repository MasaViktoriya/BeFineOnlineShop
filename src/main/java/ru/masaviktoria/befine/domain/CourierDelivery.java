package ru.masaviktoria.befine.domain;


import lombok.Getter;
import lombok.Setter;
import ru.masaviktoria.befine.dto.OfflineDeliveryDTO;

import java.util.*;
import java.time.*;

@Getter
@Setter
public class CourierDelivery {

    private Long id;
    private Long orderId;
    private LocalDate chosenDate;
    private LocalTime chosenTime;
    private LocalDateTime estimatedDateTime;
    private Integer price;
    private String chosenAddress;
    private String deliveryStatus;
    private Long serviceProviderId;
    private String timetable;
    private List<Product> productsForThisDeliveryList;

    public CourierDelivery() {
    }

    public CourierDelivery(OfflineDeliveryDTO offlineDeliveryDTO) {
        this.id = offlineDeliveryDTO.getDeliveryId();
        this.orderId = offlineDeliveryDTO.getOrderId();
        this.chosenAddress = offlineDeliveryDTO.getChosenAddress();
        this.deliveryStatus = offlineDeliveryDTO.getDeliveryStatus();
        this.productsForThisDeliveryList = offlineDeliveryDTO.getProductsForThisDeliveryList();
        this.chosenDate = offlineDeliveryDTO.getChosenDate();
        this.chosenTime = offlineDeliveryDTO.getChosenTime();
        this.price = offlineDeliveryDTO.getPrice();
        this.serviceProviderId = offlineDeliveryDTO.getServiceProviderId();
        this.timetable = offlineDeliveryDTO.getTimetable();
        this.estimatedDateTime = offlineDeliveryDTO.getEstimatedDateTime();
    }

    public CourierDelivery(Long id, Long orderId, LocalDate chosenDate, LocalTime chosenTime, LocalDateTime estimatedDateTime, Integer price, String chosenAddress, String deliveryStatus, Long serviceProviderId, String timetable, List<Product> productsForThisDeliveryList) {
        this.id = id;
        this.orderId = orderId;
        this.chosenDate = chosenDate;
        this.chosenTime = chosenTime;
        this.estimatedDateTime = estimatedDateTime;
        this.price = price;
        this.chosenAddress = chosenAddress;
        this.deliveryStatus = deliveryStatus;
        this.serviceProviderId = serviceProviderId;
        this.timetable = timetable;
        this.productsForThisDeliveryList = productsForThisDeliveryList;
    }
}