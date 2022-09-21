package com.example.dataserviceplatform.Service;

import com.example.dataserviceplatform.Entity.Project;

import java.util.List;

public interface ProjectService {
    /*
    *查找项目
    * @Param pid
    * */
    List<Project> getProject(Integer pid);
}
