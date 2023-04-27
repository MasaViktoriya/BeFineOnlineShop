package ru.masaviktoria.befine.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.masaviktoria.befine.dao.*;
import ru.masaviktoria.befine.dao.DeliveryRepository;
import ru.masaviktoria.befine.domain.CourierDelivery;
import ru.masaviktoria.befine.domain.OnlineDelivery;
import ru.masaviktoria.befine.domain.PickUpPointDelivery;
import ru.masaviktoria.befine.domain.PostamateDelivery;

import java.time.LocalDate;
import java.time.LocalTime;


@Service
@RequiredArgsConstructor
public class DeliveryServiceImpl<T> implements DeliveryService{
    private final DeliveryRepository<T> deliveryRepository;

    public <T> DeliveryDAO<T> createDelivery(DeliveryDAO<T> deliveryDAO) {
        deliveryRepository.createDelivery(deliveryDAO);
        return deliveryDAO;
    }

    public OnlineDelivery createOnlineDelivery() {
        return null;
    }

    public CourierDelivery createCourierDelivery() {
        return null;
    }

    public PostamateDelivery createPostamateDelivery() {
        return null;
    }

    public PickUpPointDelivery createPickUpPointDelivery() {
        return null;
    }

    public void deleteDelivery(Long deliveryId) {

    }

    public <D> DeliveryDAO<D> showDelivery(Long deliveryId) {
        return null;
    }

    public <D> void updateDelivery(DeliveryDAO<D> deliveryDAO){

    }

    public void updateCourierDelivery(CourierDelivery courierDelivery) {

    }

    public void updatePostamateDelivery(PostamateDelivery postamateDelivery) {

    }

    public void updatePickUpPointDelivery(PickUpPointDelivery pickUpPointDelivery) {

    }

    public void updateOnlineDelivery(OnlineDelivery onlineDelivery) {

    }

    public LocalDate chooseDate() {
        return null;
    }

    public LocalDate changeDate() {
        return null;
    }

    public LocalTime chooseTime() {
        return null;
    }

    public LocalTime changeTime() {
        return null;
    }

    public String chooseAddress() {
        return null;
    }

    public String addNewAddress(String newAddress) {
        return null;
    }

    public String changeAddress() {
        return null;
    }

}