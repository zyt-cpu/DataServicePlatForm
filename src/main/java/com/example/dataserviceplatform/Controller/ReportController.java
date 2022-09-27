package com.example.dataserviceplatform.Controller;
import com.example.dataserviceplatform.Entity.Report;
import com.example.dataserviceplatform.Result.ResponseVO;
import com.example.dataserviceplatform.Service.ReportService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("reportMsg")
public class ReportController {
    @Autowired
    private ReportService reportService;

    @GetMapping("/getAllReport")
    public ResponseVO getAllReport(){
        return ResponseVO.buildSuccess(reportService.getAllReport());
    }

    @GetMapping("/addReport")
    public ResponseVO addReport(@RequestBody JSONPObject jsonpObject){
        Report report=new Report();
        reportService.addReport(report);
        return ResponseVO.buildSuccess();
    }

    @GetMapping("/reportArchivingStatus/{project_id}/{report_archiving}")
    public ResponseVO reportArchivingStatus(@PathVariable("project_id") Integer pid , @PathVariable("report_archiving") String status){
        reportService.reportArchivingStatus(pid,status);
        return ResponseVO.buildSuccess();
    }
}
