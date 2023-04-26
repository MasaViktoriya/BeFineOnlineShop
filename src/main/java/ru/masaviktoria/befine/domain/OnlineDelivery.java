package ru.masaviktoria.befine.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.masaviktoria.befine.dto.OnlineDeliveryDTO;

import java.time.*;

@Getter
@Setter
@NoArgsConstructor
public class OnlineDelivery {

    private Long deliveryId;
    private Long orderId;
    private Long zoomRoomId;
    private LocalDate chosenDate;
    private LocalTime chosenTime;
    private Long consultantId;
    private Long consultationId;
    private String deliveryStatus;


    public OnlineDelivery(OnlineDeliveryDTO onlineDeliveryDTO) {
        this.deliveryId = onlineDeliveryDTO.getDeliveryId();
        this.orderId = onlineDeliveryDTO.getOrderId();
        this.chosenDate = onlineDeliveryDTO.getChosenDate();
        this.chosenTime = onlineDeliveryDTO.getChosenTime();
        this.consultantId = onlineDeliveryDTO.getConsultantId();
        this.deliveryStatus = onlineDeliveryDTO.getDeliveryStatus();
        this.consultationId = onlineDeliveryDTO.getConsultationId();
        this.zoomRoomId = onlineDeliveryDTO.getZoomRoomId();
    }

    public OnlineDelivery(Long orderId, Long zoomRoomId, LocalDate chosenDate, LocalTime chosenTime, Long consultantId, Long consultationId, String deliveryStatus) {
        this.orderId = orderId;
        this.zoomRoomId = zoomRoomId;
        this.chosenDate = chosenDate;
        this.chosenTime = chosenTime;
        this.consultantId = consultantId;
        this.consultationId = consultationId;
        this.deliveryStatus = deliveryStatus;
    }


    @Override
    public String toString() {
        return "OnlineDelivery{" +
                "id=" + deliveryId +
                ", orderId=" + orderId +
                ", zoomRoomId=" + zoomRoomId +
                ", chosenDate=" + chosenDate +
                ", chosenTime=" + chosenTime +
                ", consultantId=" + consultantId +
                ", consultationId=" + consultationId +
                ", deliveryStatus='" + deliveryStatus + '\'' +
                '}';
    }
}