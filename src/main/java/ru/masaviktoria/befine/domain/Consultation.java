package ru.masaviktoria.befine.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class Consultation extends Product {

    private Long id;
    private Integer duration;
    private Consultant consultant;
    private Set<Option> options = new HashSet<>();

}