package ru.masaviktoria.befine.services;

import ru.masaviktoria.befine.dao.ConsultantDAO;
import ru.masaviktoria.befine.dao.ConsultationDAO;
import ru.masaviktoria.befine.dao.OptionDAO;

import java.util.List;

public interface ConsultantService {

    ConsultantDAO createConsultant(ConsultantDAO consultantDAO);

    void updateConsultant(ConsultantDAO consultantDAO);

    void deleteConsultant(Long id);

    ConsultantDAO showConsultant(Long id);

    List<ConsultationDAO> showConsultationList();

    List<OptionDAO> showOptionList();
}
