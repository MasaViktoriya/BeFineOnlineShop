package ru.masaviktoria.befine.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.masaviktoria.befine.dao.SuppliesDAO;
import ru.masaviktoria.befine.dao.SuppliesRepository;

@Service
public class SuppliesServiceImpl implements SuppliesService {

    private SuppliesRepository suppliesRepository;

    @Autowired
    public SuppliesServiceImpl(SuppliesRepository suppliesRepository) {
        this.suppliesRepository = suppliesRepository;
    }

    public SuppliesDAO createSupplies(SuppliesDAO suppliesDAO) {
        return null;

    }

    public SuppliesDAO showSupplies(Long suppliesId){
        return null;
    }

    public void updateSupplies(SuppliesDAO suppliesDAO) {

    }

    public void deleteSupplies(Long suppliesId){

    }

}