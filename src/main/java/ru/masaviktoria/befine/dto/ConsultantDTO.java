package ru.masaviktoria.befine.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.masaviktoria.befine.domain.Consultation;
import ru.masaviktoria.befine.domain.Option;

import java.util.*;

@Getter
@Setter
@NoArgsConstructor
public class ConsultantDTO {

    private String name;
    private Integer age;
    private String description;
    private Byte[] photo;
    private List<Consultation> consultationList;
    private List<Option> optionList;

}