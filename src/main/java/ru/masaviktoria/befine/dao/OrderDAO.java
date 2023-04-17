package ru.masaviktoria.befine.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.masaviktoria.befine.domain.DeliveryList;

import java.util.*;
import java.time.*;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class OrderDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "purchase_date_time")
    private LocalDateTime purchaseDateTime;

    @Column(name = "is_delivered")
    private Boolean isDelivered;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "is_on_return")
    private Boolean isOnReturn;

    @Column(name = "is_cancelled")
    private Boolean isCancelled;

    @Column(name = "is_returned")
    private Boolean isReturned;

/*    @Column(name = "delivery_list")
    private DeliveryList deliveryList;*/

    @OneToMany(mappedBy = "products")
    private List<ProductDAO> productDAOList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private CustomerDAO customerDAO;

    public OrderDAO() {
    }

    public OrderDAO(CustomerDAO customerDAO, LocalDateTime purchaseDateTime, Boolean isDelivered, Boolean isActive, Boolean isOnReturn, Boolean isCancelled, Boolean isReturned) {
        this.customerDAO = customerDAO;
        this.purchaseDateTime = purchaseDateTime;
        this.isDelivered = isDelivered;
        this.isActive = isActive;
        this.isOnReturn = isOnReturn;
        this.isCancelled = isCancelled;
        this.isReturned = isReturned;
    }


}