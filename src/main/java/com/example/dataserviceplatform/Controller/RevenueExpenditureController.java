package com.example.dataserviceplatform.Controller;

import com.example.dataserviceplatform.Entity.Project;
import com.example.dataserviceplatform.Entity.RevenueExpenditure;
import com.example.dataserviceplatform.Result.ResponseVO;
import com.example.dataserviceplatform.Service.RevenueExpenditureService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("revenueMsg")
public class RevenueExpenditureController {

    @Autowired
    private RevenueExpenditureService revenueExpenditureService;

    @GetMapping("/getAllRevenue")
    public ResponseVO getAllRevenue(){
        return ResponseVO.buildSuccess(revenueExpenditureService.getAllRevenueExpenditure());
    }

    @GetMapping("/findRevenueById/{id}")
    public ResponseVO findRevenueById(@PathVariable("id") Integer id){
        return ResponseVO.buildSuccess(revenueExpenditureService.getRevenueExpenditureById(id));
    }

    @GetMapping("/deleteRevenueById")
    public void deleteRevenueById(Integer id){
        System.out.print("controller");
        revenueExpenditureService.deleteRevenueExpenditureById(id);
    }

    @GetMapping("/addRevenue")
    public ResponseVO addRevenue(@RequestBody JSONPObject jsonpObject){
        RevenueExpenditure revenueExpenditure = new RevenueExpenditure();
        revenueExpenditureService.addRevenueExpenditure(revenueExpenditure);
        return ResponseVO.buildSuccess();
    }
}
