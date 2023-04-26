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
public class PostamateDelivery {

    private Long id;
    private Long orderId;
    private Long postamateId;
    private LocalDateTime estimatedDateTime;
    private Integer price;
    private String postamateAddress;
    private String deliveryStatus;
    private Long serviceProviderId;
    private String timetable;

    private List<Product> productsForThisDeliveryList;


    public PostamateDelivery(OfflineDeliveryDTO offlineDeliveryDTO) {
        this.id = offlineDeliveryDTO.getDeliveryId();
        this.orderId = offlineDeliveryDTO.getOrderId();
        this.postamateAddress = offlineDeliveryDTO.getChosenAddress();
        this.deliveryStatus = offlineDeliveryDTO.getDeliveryStatus();
        this.productsForThisDeliveryList = offlineDeliveryDTO.getProductsForThisDeliveryList();
        this.estimatedDateTime = offlineDeliveryDTO.getEstimatedDateTime();
        this.price = offlineDeliveryDTO.getPrice();
        this.serviceProviderId = offlineDeliveryDTO.getServiceProviderId();
        this.timetable = offlineDeliveryDTO.getTimetable();
        this.postamateId = offlineDeliveryDTO.getPostamateId();
    }

    public PostamateDelivery(Long id, Long orderId, Long postamateId, LocalDateTime estimatedDateTime, Integer price, String postamateAddress, String deliveryStatus, Long serviceProviderId, String timetable, List<Product> productsForThisDeliveryList) {
        this.id = id;
        this.orderId = orderId;
        this.postamateId = postamateId;
        this.estimatedDateTime = estimatedDateTime;
        this.price = price;
        this.postamateAddress = postamateAddress;
        this.deliveryStatus = deliveryStatus;
        this.serviceProviderId = serviceProviderId;
        this.timetable = timetable;
        this.productsForThisDeliveryList = productsForThisDeliveryList;
    }
}