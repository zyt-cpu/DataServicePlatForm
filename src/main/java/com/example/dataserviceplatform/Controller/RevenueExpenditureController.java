package com.example.dataserviceplatform.Controller;

import org.json.JSONObject;
import com.example.dataserviceplatform.Entity.Project;
import com.example.dataserviceplatform.Entity.RevenueExpenditure;
import com.example.dataserviceplatform.Result.ResponseVO;
import com.example.dataserviceplatform.Service.RevenueExpenditureService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/revenueMsg")
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

    @GetMapping("/deleteRevenueById/{id}")
    public ResponseVO deleteRevenueById(@PathVariable("id") Integer id){
        if (findRevenueById(id).getContent()!=null){
            revenueExpenditureService.deleteRevenueExpenditureById(id);
            return ResponseVO.buildSuccess();
        }
        return ResponseVO.buildFailure("删除失败");
    }

    @PostMapping("/addRevenue")
    public ResponseVO addRevenue(@RequestBody JSONObject jsonpObject){
        RevenueExpenditure revenueExpenditure = new RevenueExpenditure();
        System.out.println(jsonpObject);
        revenueExpenditureService.addRevenueExpenditure(revenueExpenditure);
        return ResponseVO.buildSuccess();
    }
}
