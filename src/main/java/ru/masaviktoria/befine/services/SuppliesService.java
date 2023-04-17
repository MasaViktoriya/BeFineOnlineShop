package ru.masaviktoria.befine.services;

import ru.masaviktoria.befine.dao.SuppliesDAO;

public interface SuppliesService {

    SuppliesDAO createSupplies(SuppliesDAO suppliesDAO);

    SuppliesDAO showSupplies(Long suppliesId);

    void updateSupplies(SuppliesDAO suppliesDAO);

    void deleteSupplies(Long suppliesId);
}
