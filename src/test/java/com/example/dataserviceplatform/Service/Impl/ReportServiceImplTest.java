package com.example.dataserviceplatform.Service.Impl;
import com.example.dataserviceplatform.Entity.Report;
import com.example.dataserviceplatform.Repository.ReportRepository;
import com.example.dataserviceplatform.Service.ReportService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReportServiceImplTest {
    @Autowired
    ReportService reportService;
    @Autowired
    ReportRepository reportRepository;

    @Test
    public void getReportTest(){
        List<Report> result= reportService.getAllReport();
        for (int i=0;i<result.size();i++){
            System.out.println( result.get(i));
        }
    }

    @Test
    public void addProjectTest(){
        Report report=new Report();
    }

    @Test
    public void  reportArchivingStatusTest(){
        reportService.reportArchivingStatus(1,"1");
        Report project=reportRepository.getReportById(1);
        System.out.print(project.getReportArchiving());
        reportService.reportArchivingStatus(1,"0");
        //Assert.assertNotEquals(java.util.Optional.of(4),project.getProjectLevel());
    }
}
