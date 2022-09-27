package com.example.dataserviceplatform.Service;
import com.example.dataserviceplatform.Entity.Report;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ReportService {
    /*
     *查找报告
     * */
    List<Report> getAllReport();

    /*
     * 添加报告
     *@Param report
     * */
    void addReport(Report report);

    /*
     * 报告归档
     * @Param report,reportArchiving
     * */
    void reportArchivingStatus(Integer id, String status);
}

