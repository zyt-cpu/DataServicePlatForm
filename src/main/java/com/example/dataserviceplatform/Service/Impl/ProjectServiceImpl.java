package com.example.dataserviceplatform.Service.Impl;

import com.example.dataserviceplatform.Entity.Project;
import com.example.dataserviceplatform.Repository.ProjectRepository;
import com.example.dataserviceplatform.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> getAllProject(){
        return projectRepository.findAll();
    }

    @Override
    public void addProject(Project project){
        System.out.println("service");
        projectRepository.save(project);
    }

    @Override
    @Transactional
    public void modifyProjectLevel(Integer id,Integer level){
        //System.out.print("modify begin");
        projectRepository.modify(id,level);
        //System.out.print("modify end");
//        Project project=projectRepository.getProjectById(id);
//        project.setProjectLevel(level);
//        //修改方法
//
//        projectRepository.saveAndFlush(project);
    }

    @Override
    public Project getProject(Integer id){
        return projectRepository.getProjectById(id);
    }

    @Override
    public void deleteById(Integer id){
        projectRepository.deleteById(id);
    }
}
