package com.example.dataserviceplatform.Controller;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectTest {
    @Autowired
    ProjectController projectController;

    @Test
    public void getProjectTest(){

    }

    @Test
    public void modifyProjectLevelTest(){

    }

    @Test
    public void addProjectTest(){
        //for(int i=0;i<10;i++){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("contractAbbreviation","南京");
        jsonObject.put("creatorId","001");
        jsonObject.put("createTime","2021-10-01 10:30:00");
        jsonObject.put("contractName","南京安防");
        jsonObject.put("contractSigningPersonnel","李四");
        jsonObject.put("projectLeader","张三");
        jsonObject.put("contractStartTime","2021-10-07 10:00:00");
        jsonObject.put("ontractEndTime","2021-12-17 10:00:00");
        jsonObject.put("contractAmount","1213.8");
        jsonObject.put("researchOffice","1");
        jsonObject.put("projectStatus","1");
        jsonObject.put("contractArchiving","0");
        jsonObject.put("projectLevel","4");
        jsonObject.put("firstParty","南京");
        jsonObject.put("projectYear","2021");
        jsonObject.put("bidSecurity","0.00");
        jsonObject.put("estimatedProfitMargin","0");
        jsonObject.put("deleted","0");
        jsonObject.put("contributionOfParticipants","暂无报告");
        jsonObject.put("remarks","无");
        jsonObject.put("bidSecurityReturn","0");
        jsonObject.put("bidFee","0.00");
        jsonObject.put("bidFeeInvoicing","0");
        jsonObject.put("receivable","3.14");
        jsonObject.put("engineering","0");
        // }
        projectController.addProject(jsonObject);
    }

    @Test
    public void projectStaticTest(){
        System.out.print(projectController.projectStatis());
    }
}
