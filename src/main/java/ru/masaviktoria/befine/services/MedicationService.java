package ru.masaviktoria.befine.services;

import ru.masaviktoria.befine.dao.MedicationDAO;

public interface MedicationService {

    MedicationDAO createMedication(MedicationDAO medicationDAO);

    MedicationDAO showMedication(Long medicationId);

    void updateMedication(MedicationDAO medicationDAO);

    void deleteMedication(Long id);

    void showReceiptAlert();
}
