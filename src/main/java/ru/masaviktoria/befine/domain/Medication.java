package ru.masaviktoria.befine.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Medication extends Product {

    private Long id;
    private String size;
    private String producer;
    private String instruction;
    private Boolean isPrescriptionRequired;

}