package ru.masaviktoria.befine.domain;

import lombok.Getter;
import lombok.Setter;
import ru.masaviktoria.befine.dao.DeliveryDAO;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class DeliveryList {
    private List<DeliveryDAO<?>> deliveryDAOList;

    public DeliveryList() {
    }

    public DeliveryList(List<DeliveryDAO<?>> deliveryDAOList) {
        this.deliveryDAOList = deliveryDAOList;
    }

    public DeliveryList(DeliveryDAO<?> deliveryDAO){
        List<DeliveryDAO<?>> deliveryDAOList = new ArrayList<DeliveryDAO<?>>();
        deliveryDAOList.add(deliveryDAO);
        this.deliveryDAOList = deliveryDAOList;
    }
}
