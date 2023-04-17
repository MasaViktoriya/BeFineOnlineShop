package ru.masaviktoria.befine.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Medication extends Product {

    private Long id;
    private String size;
    private String producer;
    private String instruction;
    private Boolean isPrescriptionRequired;

    public Medication() {
    }


}