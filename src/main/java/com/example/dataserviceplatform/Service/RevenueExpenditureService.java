package com.example.dataserviceplatform.Service;

import com.example.dataserviceplatform.Entity.Project;
import com.example.dataserviceplatform.Entity.RevenueExpenditure;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RevenueExpenditureService {
    List<RevenueExpenditure> getAllRevenueExpenditure();

    RevenueExpenditure getRevenueExpenditureById(Integer id);
}
