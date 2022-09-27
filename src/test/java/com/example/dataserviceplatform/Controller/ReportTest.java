package com.example.dataserviceplatform.Controller;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReportTest {
    @Autowired
    ReportController project;

    @Test
    public void getReportTest(){
        project.getAllReport();
    }

    @Test
    public void reportArchivingStatusTest(){

    }

    @Test
    public void addReportTest(){

    }

}
