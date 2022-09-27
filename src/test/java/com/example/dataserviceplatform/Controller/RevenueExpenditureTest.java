package com.example.dataserviceplatform.Controller;

import com.example.dataserviceplatform.Result.ResponseVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RevenueExpenditureTest {

    @Autowired
    private RevenueExpenditureController revenueExpenditure;

    @Test
    public void getRevenueExpenditureTest(){
        ResponseVO allRevenue = revenueExpenditure.getAllRevenue();

    }


}
