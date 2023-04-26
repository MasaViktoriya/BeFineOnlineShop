package ru.masaviktoria.befine.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Option {

    private Long id;
    private String title;
    private Integer priceChangeDelta;
    private String description;
    private Consultation consultation;
    private Consultant consultant;

}