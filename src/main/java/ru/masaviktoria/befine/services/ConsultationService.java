package ru.masaviktoria.befine.services;

import ru.masaviktoria.befine.dao.ConsultantDAO;
import ru.masaviktoria.befine.dao.ConsultationDAO;
import ru.masaviktoria.befine.dao.OptionDAO;

import java.util.List;

public interface ConsultationService {

    ConsultationDAO showConsultation(Long consultationId);

    void deleteConsultation(Long consultationId);

    ConsultationDAO createConsultation(ConsultationDAO consultationDAO);

    void updateConsultation(ConsultationDAO consultationDAO);

    List<OptionDAO> showOptionList();

    List<OptionDAO> chooseOptions();

    void discardOptions();

    ConsultantDAO chooseConsultant(Long consultantId);

    OptionDAO showOption(Long optionId);

    OptionDAO createOption(OptionDAO optionDAO);

    void updateOption(OptionDAO optionDAO);

    void deleteOption(Long optionId);

    Integer chooseDuration();

    Integer recalculatePrice(Integer duration, List<OptionDAO> optionDAOList);
}
