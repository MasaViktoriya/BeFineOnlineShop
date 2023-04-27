package ru.masaviktoria.befine.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.masaviktoria.befine.dao.ConsultantDAO;
import ru.masaviktoria.befine.dao.ConsultationDAO;
import ru.masaviktoria.befine.dao.OptionDAO;
import ru.masaviktoria.befine.dao.ConsultationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConsultationServiceImpl implements ConsultationService {

    private final ConsultationRepository consultationRepository;

    public ConsultationDAO showConsultation(Long consultationId){
        return null;
    }

    public void deleteConsultation(Long consultationId){

    }

    public ConsultationDAO createConsultation(ConsultationDAO consultationDAO) {
        return null;
    }

    public void updateConsultation(ConsultationDAO consultationDAO) {

    }

    public OptionDAO showOption(Long optionId) {
        return null;
    }

    public OptionDAO createOption(OptionDAO optionDAO) {
        return null;
    }

    public void updateOption(OptionDAO optionDAO) {

    }

    public void deleteOption(Long optionId) {

    }

    public List<OptionDAO> showOptionList() {
        return null;
    }

    public List<OptionDAO> chooseOptions() {
        return null;
    }

    public void discardOptions() {

    }

    public ConsultantDAO chooseConsultant(Long consultantId) {
        return null;
    }

    public Integer chooseDuration() {
        return null;
    }

    public Integer recalculatePrice(Integer duration, List<OptionDAO> optionDAOList) {
        return null;
    }

}