package ru.masaviktoria.befine.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuppliesRepository  extends JpaRepository<SuppliesDAO, Long> {

}