package ru.masaviktoria.befine.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.masaviktoria.befine.dao.MedicationDAO;
import ru.masaviktoria.befine.dao.MedicationRepository;

@Service
@RequiredArgsConstructor
public class MedicationServiceImpl implements MedicationService {

    private final MedicationRepository medicationRepository;

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