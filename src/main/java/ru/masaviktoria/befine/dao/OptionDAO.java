package ru.masaviktoria.befine.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "options")
@Getter
@Setter
@NoArgsConstructor
public class OptionDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "price_change_delta")
    private Integer priceChangeDelta;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "consultation_id")
    private ConsultationDAO consultationDAO;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "consultant_id")
    private ConsultantDAO consultantDAO;

}