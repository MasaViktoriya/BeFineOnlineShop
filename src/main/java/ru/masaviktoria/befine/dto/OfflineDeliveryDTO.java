package ru.masaviktoria.befine.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.masaviktoria.befine.domain.CourierDelivery;
import ru.masaviktoria.befine.domain.PickUpPointDelivery;
import ru.masaviktoria.befine.domain.PostamateDelivery;
import ru.masaviktoria.befine.domain.Product;

import java.util.*;
import java.time.*;

@Getter
@Setter
@NoArgsConstructor
public class OfflineDeliveryDTO {

    private Long orderId;
    private Integer price;
    private String chosenAddress;
    private LocalDateTime estimatedDateTime;
    private LocalTime chosenTime;
    private LocalDate chosenDate;
    private String timetable;
    private Long serviceProviderId;
    private String deliveryStatus;
    private List<Product> productsForThisDeliveryList;
    private Long deliveryId;
    private Long postamateId;

    private Long pickPointId;

    private String type;


    public OfflineDeliveryDTO(CourierDelivery courierDelivery) {
        this.deliveryId = courierDelivery.getId();
        this.orderId = courierDelivery.getOrderId();
        this.chosenAddress = courierDelivery.getChosenAddress();
        this.chosenDate = courierDelivery.getChosenDate();
        this.deliveryStatus = courierDelivery.getDeliveryStatus();
        this.chosenTime = courierDelivery.getChosenTime();
        this.estimatedDateTime = courierDelivery.getEstimatedDateTime();
        this.price = courierDelivery.getPrice();
        this.productsForThisDeliveryList = courierDelivery.getProductsForThisDeliveryList();
        this.serviceProviderId = courierDelivery.getServiceProviderId();
        this.timetable = courierDelivery.getTimetable();
    }

    public OfflineDeliveryDTO(PostamateDelivery postamateDelivery) {
        this.deliveryId = postamateDelivery.getId();
        this.orderId = postamateDelivery.getOrderId();
        this.deliveryStatus = postamateDelivery.getDeliveryStatus();
        this.estimatedDateTime = postamateDelivery.getEstimatedDateTime();
        this.postamateId = postamateDelivery.getPostamateId();
        this.chosenAddress = postamateDelivery.getPostamateAddress();
        this.price = postamateDelivery.getPrice();
        this.productsForThisDeliveryList = postamateDelivery.getProductsForThisDeliveryList();
        this.serviceProviderId = postamateDelivery.getServiceProviderId();
        this.timetable = postamateDelivery.getTimetable();
    }

    public OfflineDeliveryDTO(PickUpPointDelivery pickUpPointDelivery) {
        this.deliveryId = pickUpPointDelivery.getId();
        this.orderId = pickUpPointDelivery.getOrderId();
        this.deliveryStatus = pickUpPointDelivery.getDeliveryStatus();
        this.estimatedDateTime = pickUpPointDelivery.getEstimatedDateTime();
        this.postamateId = pickUpPointDelivery.getPickPointId();
        this.chosenAddress = pickUpPointDelivery.getPickUpPointAddress();
        this.price = pickUpPointDelivery.getPrice();
        this.productsForThisDeliveryList = pickUpPointDelivery.getProductsForThisDeliveryList();
        this.serviceProviderId = pickUpPointDelivery.getServiceProviderId();
        this.timetable = pickUpPointDelivery.getTimetable();
    }
}