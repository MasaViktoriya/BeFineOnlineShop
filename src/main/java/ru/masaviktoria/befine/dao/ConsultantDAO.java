package ru.masaviktoria.befine.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@Entity
@Table(name = "consultants")
@Getter
@Setter
@NoArgsConstructor
public class ConsultantDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "photo")
    private Byte[] photo;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "consultant")
    private Set<ConsultationDAO> possibleConsultationsDAO = new HashSet<>();

    @OneToMany(mappedBy = "consultant")
    private Set<OptionDAO> possibleOptionsDAO = new HashSet<>();


}