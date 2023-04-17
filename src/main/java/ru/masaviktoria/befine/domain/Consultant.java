package ru.masaviktoria.befine.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Consultant {

    private Long id;
    private String name;
    private Integer age;
    private Byte[] photo;
    private String description;
    private Set<Consultation> possibleConsultations = new HashSet<>();
    private Set<Option> possibleOptions = new HashSet<>();


    public Consultant() {
    }


    public Consultant(String name, Integer age, Byte[] photo, String description, Set<Consultation> possibleConsultations, Set<Option> possibleOptions) {
        this.name = name;
        this.age = age;
        this.photo = photo;
        this.description = description;
        this.possibleConsultations = possibleConsultations;
        this.possibleOptions = possibleOptions;
    }
}