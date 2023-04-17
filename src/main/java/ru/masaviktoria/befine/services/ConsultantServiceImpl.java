package ru.masaviktoria.befine.services;

import org.springframework.stereotype.Service;
import ru.masaviktoria.befine.dao.ConsultantDAO;
import ru.masaviktoria.befine.dao.ConsultationDAO;
import ru.masaviktoria.befine.dao.OptionDAO;
import ru.masaviktoria.befine.dao.ConsultantRepository;

import java.util.List;

@Service
public class ConsultantServiceImpl implements ConsultantService {

    private ConsultantRepository consultantRepository;

    public ConsultantServiceImpl(ConsultantRepository consultantRepository) {
        this.consultantRepository = consultantRepository;
    }

    public ConsultantDAO createConsultant(ConsultantDAO consultantDAO) {
        return null;
    }

    public void updateConsultant(ConsultantDAO consultantDAO) {

    }

    public void deleteConsultant(Long id) {

    }

    public ConsultantDAO showConsultant(Long id) {
        return null;
    }

    public List<ConsultationDAO> showConsultationList() {
        return null;
    }

    public List<OptionDAO> showOptionList() {
        return null;
    }

}