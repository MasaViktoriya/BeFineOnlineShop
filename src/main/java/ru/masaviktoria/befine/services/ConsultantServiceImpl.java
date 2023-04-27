package ru.masaviktoria.befine.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.masaviktoria.befine.dao.ConsultantDAO;
import ru.masaviktoria.befine.dao.ConsultationDAO;
import ru.masaviktoria.befine.dao.OptionDAO;
import ru.masaviktoria.befine.dao.ConsultantRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConsultantServiceImpl implements ConsultantService {

    private final ConsultantRepository consultantRepository;

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