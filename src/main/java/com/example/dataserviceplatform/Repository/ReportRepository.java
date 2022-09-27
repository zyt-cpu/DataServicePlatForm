package com.example.dataserviceplatform.Repository;
import com.example.dataserviceplatform.Entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReportRepository extends JpaRepository<Report,Integer>
{
    List<Report> findAll();
    Report getReportById(Integer id);

    @Modifying
    @Query("update Project set reportArchiving=:reportArchiving where id=:id")
    void modify(@Param("id")Integer id, @Param("reportArchiving")String reportArchiving);
}
