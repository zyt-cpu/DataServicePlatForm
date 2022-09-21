package com.example.dataserviceplatform.Service.Impl;

import com.example.dataserviceplatform.Entity.Project;
import com.example.dataserviceplatform.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl {
    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> getProject(Integer pid){
        return projectRepository.findAllByPid(pid);
    }
}
