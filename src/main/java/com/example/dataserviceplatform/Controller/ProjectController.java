package com.example.dataserviceplatform.Controller;

import com.example.dataserviceplatform.Entity.Project;
import com.example.dataserviceplatform.Result.ResponseVO;
import com.example.dataserviceplatform.Service.ProjectService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.NoArgsConstructor;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/projectMsg")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping("/getAllProject")
    public ResponseVO getAllProject(){
        return ResponseVO.buildSuccess(projectService.getAllProject());
    }

    @PostMapping("/addProject")
    public ResponseVO addProject(@RequestBody JSONObject jsonObject){
        Project project=new Project();
        //project.setProjectLevel(jsonObject.get("123"));
        System.out.print(jsonObject);
//        projectService.addProject(project);
        return ResponseVO.buildSuccess();
    }

    @GetMapping("/modifyProjectLevel/{project_id}/{project_level}")
    public ResponseVO modifyProjectLevel(@PathVariable("project_id") Integer pid ,@PathVariable("project_level") Integer level){
        projectService.modifyProjectLevel(pid,level);
        return ResponseVO.buildSuccess();
    }
}
