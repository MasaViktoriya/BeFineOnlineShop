package ru.masaviktoria.befine.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "supplies")
@PrimaryKeyJoinColumn(name = "product_id")
@Getter
@Setter
@NoArgsConstructor
public class SuppliesDAO extends ProductDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private ProductDAO productDAO;

    @Column(name = "size")
    private String size;

    @Column(name = "weight")
    private BigDecimal weight;

    @Column(name = "producer")
    private String producer;

}