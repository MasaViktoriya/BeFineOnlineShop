package ru.masaviktoria.befine.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.masaviktoria.befine.dao.SuppliesDAO;
import ru.masaviktoria.befine.dao.SuppliesRepository;

@Service
@RequiredArgsConstructor
public class SuppliesServiceImpl implements SuppliesService {

    private final SuppliesRepository suppliesRepository;

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