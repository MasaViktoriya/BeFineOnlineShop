package ru.masaviktoria.befine.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "medications")
@PrimaryKeyJoinColumn(name = "product_id")
@Getter
@Setter
public class MedicationDAO extends ProductDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private ProductDAO productDAO;

    @Column(name = "size")
    private String size;

    @Column(name = "producer")
    private String producer;

    @Column(name = "instruction")
    private String instruction;

    @Column(name = "is_prescription_required")
    private Boolean isPrescriptionRequired;

    public MedicationDAO() {
    }


}