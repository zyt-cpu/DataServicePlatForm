package com.example.dataserviceplatform.Service.Impl;

import com.example.dataserviceplatform.Entity.Project;
import com.example.dataserviceplatform.Repository.ProjectRepository;
import com.example.dataserviceplatform.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
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

    @Override
    public HashMap<String,HashMap<String,String>> projectStastic() {
        List<Project> projects = projectRepository.findAll();
        HashMap<String,HashMap<String,String>> result=new HashMap<>();
        for (int i = 0; i < 5; i++) {
            HashMap<String,String> o=new HashMap<>();
            BigDecimal c=new BigDecimal("0");
            float r=0;
            for (int j = 0; j < projects.size(); j++) {
                if (projects.get(j).getResearchOffice()==i){
                    c.add(projects.get(j).getContractAmount());
                    r+=projects.get(j).getReceivable();
                }
            }
            o.put("amount",String.valueOf(c));
            o.put("receivable",String.valueOf(r));
            result.put(String.valueOf(i),o);
        }
        return result;
    };
}
