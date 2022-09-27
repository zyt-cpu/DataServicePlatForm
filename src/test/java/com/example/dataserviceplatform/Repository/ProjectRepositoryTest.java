package com.example.dataserviceplatform.Repository;

import com.example.dataserviceplatform.Entity.Project;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

    @Test
    public void modifyLevelTest(){
        projectRepository.modify(1,4);
    }
}