package com.example.dataserviceplatform.Controller;

import com.example.dataserviceplatform.Result.ResponseVO;
import com.example.dataserviceplatform.Service.RevenueExpenditureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("revenueMsg")
public class RevenueExpenditureController {

    @Autowired
    private RevenueExpenditureService revenueExpenditureService;

    @GetMapping("/getAllRevenue")
    public ResponseVO getAllRevenue(){
        return ResponseVO.buildSuccess(revenueExpenditureService.getAllRevenueExpenditure());
    }

    @GetMapping("/findRevenueById")
    public ResponseVO findRevenueById(Integer id){
        return ResponseVO.buildSuccess(revenueExpenditureService.getRevenueExpenditureById(id));
    }
}
