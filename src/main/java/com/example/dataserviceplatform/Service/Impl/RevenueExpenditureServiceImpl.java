package com.example.dataserviceplatform.Service.Impl;

import com.example.dataserviceplatform.Entity.RevenueExpenditure;
import com.example.dataserviceplatform.Repository.RevenueExpenditureRepository;
import com.example.dataserviceplatform.Service.RevenueExpenditureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RevenueExpenditureServiceImpl implements RevenueExpenditureService {

    @Autowired
    private RevenueExpenditureRepository revenueExpenditureRepository;

    @Override
    public List<RevenueExpenditure> getAllRevenueExpenditure() {
        return revenueExpenditureRepository.findAll();
    }

    @Override
    public RevenueExpenditure getRevenueExpenditureById(Integer id) {
        return revenueExpenditureRepository.getRevenueExpenditureById(id);
    }

    @Override
    @Transactional
    public void deleteRevenueExpenditureById(Integer id) {
        revenueExpenditureRepository.deleteRevenueExpenditureById(id);
    }

    @Override
    public void addRevenueExpenditure(RevenueExpenditure revenueExpenditure) {
        revenueExpenditureRepository.save(revenueExpenditure);
    }
}
