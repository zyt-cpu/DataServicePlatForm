package com.example.dataserviceplatform.Controller;
import com.alibaba.fastjson.JSONObject;
import com.example.dataserviceplatform.Entity.Report;
import com.example.dataserviceplatform.Result.ResponseVO;
import com.example.dataserviceplatform.Service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
@RequestMapping("/reportMsg")
public class ReportController {
    @Autowired
    private ReportService reportService;

    @GetMapping("/getAllReport")
    public ResponseVO getAllReport(){
        return ResponseVO.buildSuccess(reportService.getAllReport());
    }

    @GetMapping("/addReport")
    public ResponseVO addReport(@RequestBody JSONObject jsonObject){
        Report report=new Report();
        Integer projectId= (Integer) jsonObject.get("projectId");
        report.setProjectId(projectId);
        Date createTime= (Date) jsonObject.get("createTime");
        report.setCreateTime(createTime);
        Integer creatorId= (Integer) jsonObject.get("creatorId");
        report.setCreatorId(creatorId);
        String agreedReportName= (String) jsonObject.get("agreedReportName");
        report.setAgreedReportName(agreedReportName);
        Date agreedSubmissionTime= (Date) jsonObject.get("agreedSubmissionTime");
        report.setAgreedSubmissionTime(agreedSubmissionTime);
        String reportWriter= (String) jsonObject.get("reportWriter");
        report.setReportWriter(reportWriter);
        String examiner= (String) jsonObject.get("examiner");
        report.setExaminer(examiner);
        String approver= (String) jsonObject.get("approver");
        report.setApprover(approver);
        String reviewer= (String) jsonObject.get("reviewer");
        report.setReviewer(reviewer);
        Date auditTime= (Date) jsonObject.get("auditTime");
        report.setAuditTime(auditTime);
        String reportArchiving= (String) jsonObject.get("reportArchiving");
        report.setReportArchiving(reportArchiving);
        String deleted= (String) jsonObject.get("deleted");
        report.setDeleted(deleted);
        Integer projectYear= (Integer) jsonObject.get("projectYear");
        report.setProjectYear(projectYear);
        Integer c= (Integer) jsonObject.get("c");
        report.setC(c);
        String remarks= (String) jsonObject.get("remarks");
        report.setRemarks(remarks);
        reportService.addReport(report);
        return ResponseVO.buildSuccess();
    }

    @GetMapping("/reportArchivingStatus/{project_id}/{report_archiving}")
    public ResponseVO reportArchivingStatus(@PathVariable("project_id") Integer pid , @PathVariable("report_archiving") String status){
        reportService.reportArchivingStatus(pid,status);
        return ResponseVO.buildSuccess();
    }
}
