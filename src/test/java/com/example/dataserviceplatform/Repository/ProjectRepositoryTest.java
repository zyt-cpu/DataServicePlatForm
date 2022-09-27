package com.example.dataserviceplatform.Repository;

import com.alibaba.fastjson.JSONObject;
import com.example.dataserviceplatform.Entity.Project;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectRepositoryTest {
    @Autowired
    private ProjectRepository projectRepository;

    @Test
    public void getAllProjectTest(){
        List<Project> result=projectRepository.findAll();
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i).getContractAbbreviation());
        }

    }

    @Test
    public void getProjectByIdTest(){

    }

//    @Test
//    public void modifyLevelTest(){
//        projectRepository.modify(1,0);
//    }

    @Test
    public void addProject() throws ParseException {
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("id","4");
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

        Project project2=jsonObject.toJavaObject(Project.class);

        Project project1=new Project();
        project1.setContractAbbreviation("南京");
        project1.setCreatorId("001");
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        project1.setCreateTime(new java.sql.Date (formatter.parse("2022-10-01 10:00:00").getTime()));
        project1.setContractName("南京安防");
        project1.setContractSigningPersonnel("李四");
        project1.setProjectLeader("张三");
        project1.setContractStartTime(new java.sql.Date (formatter.parse("2022-10-07 10:00:00").getTime()));
        project1.setContractEndTime(new java.sql.Date (formatter.parse("2022-12-17 10:00:00").getTime()));
        project1.setContractAmount(BigDecimal.valueOf(1213.8));
        project1.setResearchOffice(1);
        project1.setProjectStatus(1);
        project1.setContractArchiving(0);
        project1.setProjectLevel(4);
        project1.setFirstParty("南京");
        project1.setProjectYear(2022);
        project1.setBidSecurity(BigDecimal.valueOf(0));
        project1.setEstimatedProfitMargin(Float.valueOf(0));
        project1.setDeleted(0);
        project1.setContributionOfParticipants("暂无报告");
        project1.setRemarks("无");
        project1.setBidSecurityReturn(0);
        project1.setBidFee(Float.valueOf(0));
        project1.setBidFeeInvoicing(1);
        project1.setReceivable(Float.valueOf(3));
        project1.setEngineering(0);

        projectRepository.save(project1);
}
}