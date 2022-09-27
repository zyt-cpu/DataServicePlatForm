package com.example.dataserviceplatform.Repository;

import com.example.dataserviceplatform.Entity.Project;
import com.example.dataserviceplatform.Entity.RevenueExpenditure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RevenueExpenditureRepository extends JpaRepository<RevenueExpenditure,Integer> {
    List<RevenueExpenditure> findAll();
    RevenueExpenditure getRevenueExpenditureById(Integer id);

}
