package ru.masaviktoria.befine.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.masaviktoria.befine.dao.MedicationDAO;
import ru.masaviktoria.befine.dao.MedicationRepository;

@Service
public class MedicationServiceImpl implements MedicationService {

    private MedicationRepository medicationRepository;

    @Autowired
    public MedicationServiceImpl(MedicationRepository medicationRepository) {
        this.medicationRepository = medicationRepository;
    }

    public MedicationDAO createMedication(MedicationDAO medicationDAO) {
        return null;
    }

    public MedicationDAO showMedication(Long medicationId){
        return null;
    }

    public void updateMedication(MedicationDAO medicationDAO) {

    }

    public void deleteMedication(Long id){

    }

    public void showReceiptAlert() {

    }

}