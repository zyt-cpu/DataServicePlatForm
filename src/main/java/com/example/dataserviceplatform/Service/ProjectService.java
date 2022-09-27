package com.example.dataserviceplatform.Service;

import com.example.dataserviceplatform.Entity.Project;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProjectService {
    /*
    *查找所有项目
    * */
    List<Project> getAllProject();

    /*
    * 添加项目
    *@Param project
    * */
    void addProject(Project project);

    /*
    * 修改项目等级
    * @Param id,level
    * */
    void modifyProjectLevel(Integer id,Integer level);

    /*
    * 查找单个项目
    * @param id
    * */
    Project getProject(Integer id);
}
