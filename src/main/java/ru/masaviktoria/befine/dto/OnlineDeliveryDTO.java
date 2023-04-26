package ru.masaviktoria.befine.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.masaviktoria.befine.domain.OnlineDelivery;

import java.time.*;

@Getter
@Setter
@NoArgsConstructor
public class OnlineDeliveryDTO {
    private Long deliveryId;
    private Long orderId;
    private Long zoomRoomId;
    private Long consultationId;
    private LocalTime chosenTime;
    private LocalDate chosenDate;
    private Long consultantId;
    private String deliveryStatus;


    public OnlineDeliveryDTO(OnlineDelivery onlineDelivery) {
        this.deliveryId = onlineDelivery.getDeliveryId();
        this.orderId = onlineDelivery.getOrderId();
        this.chosenDate = onlineDelivery.getChosenDate();
        this.chosenTime = onlineDelivery.getChosenTime();
        this.consultantId = onlineDelivery.getConsultantId();
        this.deliveryStatus = onlineDelivery.getDeliveryStatus();
        this.consultationId = onlineDelivery.getConsultationId();
        this.zoomRoomId = onlineDelivery.getZoomRoomId();
    }
}