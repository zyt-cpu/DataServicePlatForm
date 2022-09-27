package com.example.dataserviceplatform.Service.Impl;

import com.example.dataserviceplatform.Entity.RevenueExpenditure;
import com.example.dataserviceplatform.Repository.RevenueExpenditureRepository;
import com.example.dataserviceplatform.Service.RevenueExpenditureService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RevenueExpenditureServiceImplTest {

    @Autowired
    RevenueExpenditureService revenueExpenditureService;
    @Autowired
    RevenueExpenditureRepository revenueExpenditureRepository;

    @Test
    public void getRevenueExpenditureTest(){
        List<RevenueExpenditure> revenueExpenditures = revenueExpenditureService.getAllRevenueExpenditure();
        for (int i=0;i<revenueExpenditures.size();i++){
            System.out.println( revenueExpenditures.get(i));
        }
    }


    @Test
    public void getRevenueExpenditureByIdTest(){
        int id = 1;
        RevenueExpenditure revenueExpenditureById = revenueExpenditureService.getRevenueExpenditureById(id);
        System.out.println(revenueExpenditureById);
    }
}
