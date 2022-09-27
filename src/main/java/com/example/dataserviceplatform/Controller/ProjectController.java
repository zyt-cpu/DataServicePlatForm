package com.example.dataserviceplatform.Controller;

import com.example.dataserviceplatform.Entity.Project;
import com.example.dataserviceplatform.Result.ResponseVO;
import com.example.dataserviceplatform.Service.ProjectService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("projectMsg")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping("/getAllProject")
    public ResponseVO getAllProject(){
        System.out.print("controller");
        return ResponseVO.buildSuccess(projectService.getAllProject());
    }

    @GetMapping("/addProject")
    public ResponseVO addProject(@RequestBody JSONPObject jsonpObject){
        Project project=new Project();
        projectService.addProject(project);
        return ResponseVO.buildSuccess();
    }

    @GetMapping("/modifyProjectLevel/{project_if}/{project_level}")
    public ResponseVO modifyProjectLevel(@PathVariable("project_id") Integer pid ,@PathVariable("project_level") Integer level){
        projectService.modifyProjectLevel(pid,level);
        return ResponseVO.buildSuccess();
    }
}
