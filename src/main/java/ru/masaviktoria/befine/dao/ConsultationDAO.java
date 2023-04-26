package ru.masaviktoria.befine.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@Entity
@Table(name = "consultations")
@PrimaryKeyJoinColumn(name = "product_id")
@Getter
@Setter
@NoArgsConstructor
public class ConsultationDAO extends ProductDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private ProductDAO productDAO;

    @Column(name = "duration")
    private Integer duration;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "consultant_id")
    private ConsultantDAO consultantDAO;

    @OneToMany(mappedBy = "consultation", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<OptionDAO> optionsDAO = new HashSet<>();

}