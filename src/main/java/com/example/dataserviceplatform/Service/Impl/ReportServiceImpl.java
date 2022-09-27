package com.example.dataserviceplatform.Service.Impl;
import com.example.dataserviceplatform.Entity.Report;
import com.example.dataserviceplatform.Repository.ReportRepository;
import com.example.dataserviceplatform.Service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportRepository reportRepository;

    @Override
    public List<Report> getAllReport(){
        return reportRepository.findAll();
    }

    @Override
    public void addReport(Report report){
        reportRepository.save(report);
    }

    @Override
    public void reportArchivingStatus(Integer id,String status){
        reportRepository.modify(id,status);
    }
}

