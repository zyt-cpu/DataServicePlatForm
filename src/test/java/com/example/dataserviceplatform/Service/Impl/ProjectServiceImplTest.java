package com.example.dataserviceplatform.Service.Impl;

import com.example.dataserviceplatform.Entity.Project;
import com.example.dataserviceplatform.Repository.ProjectRepository;
import com.example.dataserviceplatform.Service.ProjectService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectServiceImplTest {
    @Autowired
    ProjectService projectService;

    @Autowired
    ProjectRepository projectRepository;

    @Test
    public void getAllProjectTest(){
        List<Project> result=projectService.getAllProject();
        for (int i=0;i<result.size();i++){
            System.out.println( result.get(i));
        }
    }

    @Test
    public void addProjectTest(){
        Project project=new Project();

    }

    @Test
    public void  modifyProjectLevelTest(){
        projectService.modifyProjectLevel(1,4);
        Project project=projectRepository.getProjectById(1);
        System.out.print(project.getProjectLevel());
        projectService.modifyProjectLevel(1,0);
        //Assert.assertNotEquals(java.util.Optional.of(4),project.getProjectLevel());
    }
}
