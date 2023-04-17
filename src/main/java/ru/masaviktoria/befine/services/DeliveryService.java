package ru.masaviktoria.befine.services;

import ru.masaviktoria.befine.dao.*;
import ru.masaviktoria.befine.domain.CourierDelivery;
import ru.masaviktoria.befine.domain.OnlineDelivery;
import ru.masaviktoria.befine.domain.PickUpPointDelivery;
import ru.masaviktoria.befine.domain.PostamateDelivery;

import java.time.LocalDate;
import java.time.LocalTime;

public interface DeliveryService {

    <T> DeliveryDAO<T> createDelivery(DeliveryDAO<T> deliveryDAO);

    OnlineDelivery createOnlineDelivery();

    CourierDelivery createCourierDelivery();

    PostamateDelivery createPostamateDelivery();

    PickUpPointDelivery createPickUpPointDelivery();

    void deleteDelivery(Long deliveryId);

    <D> DeliveryDAO<D> showDelivery(Long deliveryId);

    <D> void updateDelivery(DeliveryDAO<D> deliveryDAO);

    void updateCourierDelivery(CourierDelivery courierDelivery);

    void updatePostamateDelivery(PostamateDelivery postamateDelivery);

    void updatePickUpPointDelivery(PickUpPointDelivery pickUpPointDelivery);

    void updateOnlineDelivery(OnlineDelivery onlineDelivery);

    LocalDate chooseDate();

    LocalDate changeDate();

    LocalTime chooseTime();

    LocalTime changeTime();

    String chooseAddress();

    String addNewAddress(String newAddress);

    String changeAddress();
}
